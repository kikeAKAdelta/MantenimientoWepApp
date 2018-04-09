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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Procedimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ProcedimientoFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/procedimiento")
public class ProcedimientoREST implements Serializable{
    
    @EJB 
    private ProcedimientoFacadeLocal ejbProcedimiento;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Procedimiento> findAll(){
        List listaProcedimiento = null;
        try {
            if(ejbProcedimiento != null){
                return ejbProcedimiento.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaProcedimiento;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbProcedimiento != null) {
                return ejbProcedimiento.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idProcedimiento}")
    @Produces({MediaType.APPLICATION_JSON})
    public Procedimiento findById(@PathParam("idProcedimiento") Integer idProcedimiento){
        try {
            if(ejbProcedimiento != null){
                ejbProcedimiento.find(idProcedimiento);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Procedimiento();       
    }
    
    @Path("/{idProcedimiento}")
    @DELETE
    public Response remove (@PathParam("idProcedimiento") Integer idProcedimiento){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idProcedimiento != null && this.ejbProcedimiento != null){
                ejbProcedimiento.remove(ejbProcedimiento.find(idProcedimiento));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idProcedimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Procedimiento procedimiento){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbProcedimiento!=null){
                ejbProcedimiento.create(procedimiento);
                respuesta = Response.status(Response.Status.CREATED).entity(procedimiento).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idProcedimiento}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idProcedimiento") Integer idProcedimiento, Procedimiento procedimiento) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbProcedimiento != null) {
                ejbProcedimiento.edit(procedimiento);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
