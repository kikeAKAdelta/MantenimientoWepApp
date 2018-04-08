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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DetalleOrdenTrabajoFacade;


/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/detalleOrdenTrabajo")
public class DetalleOrdenTrabajoREST implements Serializable{
    
    @EJB 
    private DetalleOrdenTrabajoFacade ejbDetalleOrdenTrabajo;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<DetalleOrdenTrabajo> findAll(){
        List listaDOT = null;
        try {
            if(ejbDetalleOrdenTrabajo != null){
                return ejbDetalleOrdenTrabajo.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaDOT;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbDetalleOrdenTrabajo != null) {
                return ejbDetalleOrdenTrabajo.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idDOT}")
    @Produces({MediaType.APPLICATION_JSON})
    public DetalleOrdenTrabajo findById(@PathParam("idDOT") Integer idDOT){
        try {
            if(ejbDetalleOrdenTrabajo != null){
                ejbDetalleOrdenTrabajo.find(idDOT);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new DetalleOrdenTrabajo();       
    }
    
    @Path("/{idDOT}")
    @DELETE
    public Response remove (@PathParam("idDOT") Integer idDOT){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idDOT != null && this.ejbDetalleOrdenTrabajo != null){
                ejbDetalleOrdenTrabajo.remove(ejbDetalleOrdenTrabajo.find(idDOT));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idDOT}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(DetalleOrdenTrabajo detalleOrdenTrabajo){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbDetalleOrdenTrabajo!=null){
                ejbDetalleOrdenTrabajo.create(detalleOrdenTrabajo);
                respuesta = Response.status(Response.Status.CREATED).entity(detalleOrdenTrabajo).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idDOT}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idDOT") Integer idDOT, DetalleOrdenTrabajo detalleOrdenTrabajo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbDetalleOrdenTrabajo != null) {
                ejbDetalleOrdenTrabajo.edit(detalleOrdenTrabajo);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
