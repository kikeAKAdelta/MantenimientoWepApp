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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Pasos;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PasosFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/pasos")
public class PasosREST implements Serializable{
    
    @EJB 
    private PasosFacadeLocal ejbPasos;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Pasos> findAll(){
        List listaPasos = null;
        try {
            if(ejbPasos != null){
                return ejbPasos.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaPasos;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbPasos != null) {
                return ejbPasos.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idPasos}")
    @Produces({MediaType.APPLICATION_JSON})
    public Pasos findById(@PathParam("idPasos") Integer idPasos){
        try {
            if(ejbPasos != null){
                ejbPasos.find(idPasos);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Pasos();       
    }
    
    @Path("/{idPasos}")
    @DELETE
    public Response remove (@PathParam("idPasos") Integer idPasos){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idPasos != null && this.ejbPasos != null){
                ejbPasos.remove(ejbPasos.find(idPasos));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idPasos}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Pasos pasos){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbPasos!=null){
                ejbPasos.create(pasos);
                respuesta = Response.status(Response.Status.CREATED).entity(pasos).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idPasos}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idPasos") Integer idPasos, Pasos pasos) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbPasos != null) {
                ejbPasos.edit(pasos);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}


