package sv.edu.uesocc.ingenieria.tpi2018.services;



import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Calendario;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.CalendarioFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Stateless
@Path("calendario")
public class CalendarioREST implements Serializable{
    
    @EJB 
    private CalendarioFacadeLocal ejbCalendario;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Calendario> findAll(){
        List listaCalendario = null;
        try {
            if(ejbCalendario != null){
                return ejbCalendario.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaCalendario;
    }
    
    @Path("count")
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public Integer count() {

        try {
            if (ejbCalendario != null) {
                return ejbCalendario.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("{idCalendario}")
    @Produces({MediaType.APPLICATION_JSON})
    public Calendario findById(@PathParam("idCalendario") Integer idCalendario){
        try {
            if(ejbCalendario != null){
                ejbCalendario.find(idCalendario);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Calendario();       
    }
    
    @Path("{idCalendario}")
    @DELETE
    public Response remove (@PathParam("idCalendario") Integer idCalendario){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idCalendario != null && this.ejbCalendario != null){
                ejbCalendario.remove(ejbCalendario.find(idCalendario));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Calendario calendario){
        try {
            if(ejbCalendario!=null){
                ejbCalendario.create(calendario);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }        
        return Response.status(Response.Status.CREATED).entity(calendario).build();
    }
    
    @PUT
    @Path("{idCalendario}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("idCalendario") Integer idCalendario, Calendario calendario) {
        try {
            if (this.ejbCalendario != null) {
                ejbCalendario.edit(calendario);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

}
