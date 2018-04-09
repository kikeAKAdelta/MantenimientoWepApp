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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.EstadoDetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EstadoDetalleOrdenTrabajoFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/estadoDetalleOrdenTrabajo")
public class EstadoDetalleOrdenTrabajoREST implements Serializable{
    
    @EJB 
    private EstadoDetalleOrdenTrabajoFacadeLocal ejbEDOT;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<EstadoDetalleOrdenTrabajo> findAll(){
        List listaEDOT = null;
        try {
            if(ejbEDOT != null){
                return ejbEDOT.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaEDOT;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbEDOT != null) {
                return ejbEDOT.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idEDOT}")
    @Produces({MediaType.APPLICATION_JSON})
    public EstadoDetalleOrdenTrabajo findById(@PathParam("idEDOT") Integer idEDOT){
        try {
            if(ejbEDOT != null){
                ejbEDOT.find(idEDOT);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new EstadoDetalleOrdenTrabajo();       
    }
    
    @Path("/{idEDOT}")
    @DELETE
    public Response remove (@PathParam("idEDOT") Integer idEDOT){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idEDOT != null && this.ejbEDOT != null){
                ejbEDOT.remove(ejbEDOT.find(idEDOT));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idEDOT}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(EstadoDetalleOrdenTrabajo edot){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbEDOT!=null){
                ejbEDOT.create(edot);
                respuesta = Response.status(Response.Status.CREATED).entity(edot).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idEDOT}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idEDOT") Integer idEDOT, EstadoDetalleOrdenTrabajo edot) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbEDOT != null) {
                ejbEDOT.edit(edot);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
