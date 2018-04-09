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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.MttoDetalleFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/mttoDetalle")
public class MttoDetalleREST implements Serializable{
    
    @EJB 
    private MttoDetalleFacadeLocal ejvMttoDet;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<MttoDetalle> findAll(){
        List listaMttoDet = null;
        try {
            if(ejvMttoDet != null){
                return ejvMttoDet.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaMttoDet;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejvMttoDet != null) {
                return ejvMttoDet.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idMttoDet}")
    @Produces({MediaType.APPLICATION_JSON})
    public MttoDetalle findById(@PathParam("idMttoDet") Integer idMttoDet){
        try {
            if(ejvMttoDet != null){
                ejvMttoDet.find(idMttoDet);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new MttoDetalle();       
    }
    
    @Path("/{idMttoDet}")
    @DELETE
    public Response remove (@PathParam("idMttoDet") Integer idMttoDet){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idMttoDet != null && this.ejvMttoDet != null){
                ejvMttoDet.remove(ejvMttoDet.find(idMttoDet));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idMttoDet}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(MttoDetalle md){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejvMttoDet!=null){
                ejvMttoDet.create(md);
                respuesta = Response.status(Response.Status.CREATED).entity(md).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idMttoDet}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idMttoDet") Integer idMttoDet, MttoDetalle md) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejvMttoDet != null) {
                ejvMttoDet.edit(md);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
