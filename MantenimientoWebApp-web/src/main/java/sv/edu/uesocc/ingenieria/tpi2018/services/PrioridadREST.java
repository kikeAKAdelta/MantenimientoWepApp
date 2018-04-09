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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Prioridad;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PrioridadFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/prioridad")
public class PrioridadREST implements Serializable{
    
    @EJB 
    private PrioridadFacadeLocal ejbPrioridad;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Prioridad> findAll(){
        List listaPrioridad = null;
        try {
            if(ejbPrioridad != null){
                return ejbPrioridad.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaPrioridad;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbPrioridad != null) {
                return ejbPrioridad.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idPrioridad}")
    @Produces({MediaType.APPLICATION_JSON})
    public Prioridad findById(@PathParam("idPrioridad") Integer idPrioridad){
        try {
            if(ejbPrioridad != null){
                ejbPrioridad.find(idPrioridad);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Prioridad();       
    }
    
    @Path("/{idPrioridad}")
    @DELETE
    public Response remove (@PathParam("idPrioridad") Integer idPrioridad){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idPrioridad != null && this.ejbPrioridad != null){
                ejbPrioridad.remove(ejbPrioridad.find(idPrioridad));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idPrioridad}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Prioridad prioridad){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbPrioridad!=null){
                ejbPrioridad.create(prioridad);
                respuesta = Response.status(Response.Status.CREATED).entity(prioridad).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idPrioridad}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idPrioridad") Integer idPrioridad, Prioridad prioridad) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbPrioridad != null) {
                ejbPrioridad.edit(prioridad);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}


