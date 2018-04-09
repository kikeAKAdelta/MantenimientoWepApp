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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Estado;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EstadoFacadeLocal;


/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/estado")
public class EstadoREST implements Serializable{
    
    @EJB 
    private EstadoFacadeLocal ejbEstado;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Estado> findAll(){
        List listaEstado = null;
        try {
            if(ejbEstado != null){
                return ejbEstado.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaEstado;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbEstado != null) {
                return ejbEstado.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idEstado}")
    @Produces({MediaType.APPLICATION_JSON})
    public Estado findById(@PathParam("idEstado") Integer idEstado){
        try {
            if(ejbEstado != null){
                ejbEstado.find(idEstado);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Estado();       
    }
    
    @Path("/{idEstado}")
    @DELETE
    public Response remove (@PathParam("idEstado") Integer idEstado){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idEstado != null && this.ejbEstado != null){
                ejbEstado.remove(ejbEstado.find(idEstado));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idEstado}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Estado estado){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbEstado!=null){
                ejbEstado.create(estado);
                respuesta = Response.status(Response.Status.CREATED).entity(estado).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idEstado}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idEstado") Integer idEstado, Estado estado) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbEstado != null) {
                ejbEstado.edit(estado);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
