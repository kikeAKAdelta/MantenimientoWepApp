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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Diagnostico;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DiagnosticoFacade;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/diagnostico")
public class DiagnosticoREST implements Serializable{
    
    @EJB 
    private DiagnosticoFacade ejbDiagnostico;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Diagnostico> findAll(){
        List listaDiagnostico = null;
        try {
            if(ejbDiagnostico != null){
                return ejbDiagnostico.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaDiagnostico;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbDiagnostico != null) {
                return ejbDiagnostico.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idDiagnostico}")
    @Produces({MediaType.APPLICATION_JSON})
    public Diagnostico findById(@PathParam("idDiagnostico") Integer idDiagnostico){
        try {
            if(ejbDiagnostico != null){
                ejbDiagnostico.find(idDiagnostico);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Diagnostico();       
    }
    
    @Path("/{idDiagnostico}")
    @DELETE
    public Response remove (@PathParam("idDiagnostico") Integer idDiagnostico){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idDiagnostico != null && this.ejbDiagnostico != null){
                ejbDiagnostico.remove(ejbDiagnostico.find(idDiagnostico));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idDiagnostico}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Diagnostico diagnostico){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbDiagnostico!=null){
                ejbDiagnostico.create(diagnostico);
                respuesta = Response.status(Response.Status.CREATED).entity(diagnostico).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idDiagnostico}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idDiagnostico") Integer idDiagnostico, Diagnostico diagnostico) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbDiagnostico != null) {
                ejbDiagnostico.edit(diagnostico);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
