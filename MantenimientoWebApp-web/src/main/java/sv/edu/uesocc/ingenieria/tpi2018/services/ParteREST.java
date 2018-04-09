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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Parte;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ParteFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/parte")
public class ParteREST implements Serializable{
    
    @EJB 
    private ParteFacadeLocal ejbParte;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Parte> findAll(){
        List listaParte = null;
        try {
            if(ejbParte != null){
                return ejbParte.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaParte;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbParte != null) {
                return ejbParte.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idParte}")
    @Produces({MediaType.APPLICATION_JSON})
    public Parte findById(@PathParam("idParte") Integer idParte){
        try {
            if(ejbParte != null){
                ejbParte.find(idParte);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Parte();       
    }
    
    @Path("/{idParte}")
    @DELETE
    public Response remove (@PathParam("idParte") Integer idParte){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idParte != null && this.ejbParte != null){
                ejbParte.remove(ejbParte.find(idParte));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idParte}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Parte parte){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbParte!=null){
                ejbParte.create(parte);
                respuesta = Response.status(Response.Status.CREATED).entity(parte).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idParte}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idParte") Integer idParte, Parte parte) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbParte != null) {
                ejbParte.edit(parte);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
