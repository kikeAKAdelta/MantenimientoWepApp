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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Unidad;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.UnidadFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/unidad")
public class UnidadREST implements Serializable{
    
    @EJB 
    private UnidadFacadeLocal ejbUnidad;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Unidad> findAll(){
        List listaUnidad = null;
        try {
            if(ejbUnidad != null){
                return ejbUnidad.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaUnidad;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbUnidad != null) {
                return ejbUnidad.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idUnidad}")
    @Produces({MediaType.APPLICATION_JSON})
    public Unidad findById(@PathParam("idUnidad") Integer idUnidad){
        try {
            if(ejbUnidad != null){
                ejbUnidad.find(idUnidad);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Unidad();       
    }
    
    @Path("/{idUnidad}")
    @DELETE
    public Response remove (@PathParam("idUnidad") Integer idUnidad){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idUnidad != null && this.ejbUnidad != null){
                ejbUnidad.remove(ejbUnidad.find(idUnidad));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idUnidad}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Unidad unidad){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbUnidad!=null){
                ejbUnidad.create(unidad);
                respuesta = Response.status(Response.Status.CREATED).entity(unidad).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idUnidad}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idUnidad") Integer idUnidad, Unidad unidad) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbUnidad != null) {
                ejbUnidad.edit(unidad);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
