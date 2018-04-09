package sv.edu.uesocc.ingenieria.tpi2018.services;



import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.ExcepcionCalendario;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ExcepcionCalendarioFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/excepcionCalendario")
public class ExcepcionCalendarioREST implements Serializable{
    
    @EJB 
    private ExcepcionCalendarioFacadeLocal ejbEC;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<ExcepcionCalendario> findAll(){
        List listaEC = null;
        try {
            if(ejbEC != null){
                return ejbEC.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaEC;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbEC != null) {
                return ejbEC.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idEC}")
    @Produces({MediaType.APPLICATION_JSON})
    public ExcepcionCalendario findById(@PathParam("idEC") Integer idEC){
        try {
            if(ejbEC != null){
                ejbEC.find(idEC);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new ExcepcionCalendario();       
    }
    
    @Path("/{idEC}")
    @DELETE
    public Response remove (@PathParam("idEC") Integer idEC){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idEC != null && this.ejbEC != null){
                ejbEC.remove(ejbEC.find(idEC));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idEC}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(ExcepcionCalendario ec){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbEC!=null){
                ejbEC.create(ec);
                respuesta = Response.status(Response.Status.CREATED).entity(ec).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idEC}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idEC") Integer idEC, ExcepcionCalendario ec) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbEC != null) {
                ejbEC.edit(ec);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
