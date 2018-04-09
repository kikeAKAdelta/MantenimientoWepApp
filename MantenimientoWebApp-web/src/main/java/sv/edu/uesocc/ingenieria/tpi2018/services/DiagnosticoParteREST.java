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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DiagnosticoParte;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DiagnosticoParteFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/diagnosticoParte")
public class DiagnosticoParteREST implements Serializable{
    
    @EJB 
    private DiagnosticoParteFacadeLocal ejbDiagnosticoParte;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<DiagnosticoParte> findAll(){
        List listaDP = null;
        try {
            if(ejbDiagnosticoParte != null){
                return ejbDiagnosticoParte.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaDP;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbDiagnosticoParte != null) {
                return ejbDiagnosticoParte.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idDP}")
    @Produces({MediaType.APPLICATION_JSON})
    public DiagnosticoParte findById(@PathParam("idDP") Integer idDP){
        try {
            if(ejbDiagnosticoParte != null){
                ejbDiagnosticoParte.find(idDP);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new DiagnosticoParte();       
    }
    
    @Path("/{idDP}")
    @DELETE
    public Response remove (@PathParam("idDP") Integer idDP){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idDP != null && this.ejbDiagnosticoParte != null){
                ejbDiagnosticoParte.remove(ejbDiagnosticoParte.find(idDP));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idDP}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(DiagnosticoParte dp){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbDiagnosticoParte!=null){
                ejbDiagnosticoParte.create(dp);
                respuesta = Response.status(Response.Status.CREATED).entity(dp).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idDP}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idDP") Integer idDP, DiagnosticoParte dp) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbDiagnosticoParte != null) {
                ejbDiagnosticoParte.edit(dp);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
