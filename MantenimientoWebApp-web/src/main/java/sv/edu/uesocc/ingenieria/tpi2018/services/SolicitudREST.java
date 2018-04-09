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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Solicitud;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.SolicitudFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/solicitud")
public class SolicitudREST implements Serializable{
    
    @EJB 
    private SolicitudFacadeLocal ejbSolicitud;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Solicitud> findAll(){
        List listaSolicitud = null;
        try {
            if(ejbSolicitud != null){
                return ejbSolicitud.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaSolicitud;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbSolicitud != null) {
                return ejbSolicitud.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idSolicitud}")
    @Produces({MediaType.APPLICATION_JSON})
    public Solicitud findById(@PathParam("idSolicitud") Integer idSolicitud){
        try {
            if(ejbSolicitud != null){
                ejbSolicitud.find(idSolicitud);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Solicitud();       
    }
    
    @Path("/{idSolicitud}")
    @DELETE
    public Response remove (@PathParam("idSolicitud") Integer idSolicitud){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idSolicitud != null && this.ejbSolicitud != null){
                ejbSolicitud.remove(ejbSolicitud.find(idSolicitud));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idSolicitud}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Solicitud solicitud){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbSolicitud!=null){
                ejbSolicitud.create(solicitud);
                respuesta = Response.status(Response.Status.CREATED).entity(solicitud).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idSolicitud}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idSolicitud") Integer idSolicitud, Solicitud solicitud) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbSolicitud != null) {
                ejbSolicitud.edit(solicitud);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
