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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.PasosProcedimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PasosProcedimientoFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/pasosProcedimiento")
public class PasosProcedimientoREST implements Serializable{
    
    @EJB 
    private PasosProcedimientoFacadeLocal ejbPasosProcedimiento;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<PasosProcedimiento> findAll(){
        List listaPasosProcedimiento = null;
        try {
            if(ejbPasosProcedimiento != null){
                return ejbPasosProcedimiento.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaPasosProcedimiento;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbPasosProcedimiento != null) {
                return ejbPasosProcedimiento.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idPasosProcedimiento}")
    @Produces({MediaType.APPLICATION_JSON})
    public PasosProcedimiento findById(@PathParam("idPasosProcedimiento") Integer idPasosProcedimiento){
        try {
            if(ejbPasosProcedimiento != null){
                ejbPasosProcedimiento.find(idPasosProcedimiento);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new PasosProcedimiento();       
    }
    
    @Path("/{idPasosProcedimiento}")
    @DELETE
    public Response remove (@PathParam("idPasosProcedimiento") Integer idPasosProcedimiento){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idPasosProcedimiento != null && this.ejbPasosProcedimiento != null){
                ejbPasosProcedimiento.remove(ejbPasosProcedimiento.find(idPasosProcedimiento));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idPasosProcedimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(PasosProcedimiento pasosProcedimiento){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbPasosProcedimiento!=null){
                ejbPasosProcedimiento.create(pasosProcedimiento);
                respuesta = Response.status(Response.Status.CREATED).entity(pasosProcedimiento).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idPasosProcedimiento}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idPasosProcedimiento") Integer idPasosProcedimiento, PasosProcedimiento pasosProcedimiento) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbPasosProcedimiento != null) {
                ejbPasosProcedimiento.edit(pasosProcedimiento);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}

