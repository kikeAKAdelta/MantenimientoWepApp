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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Tipomtto;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.TipomttoFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/tipomtto")
public class TipomttoREST implements Serializable{
    
    @EJB 
    private TipomttoFacadeLocal ejbTipomtto;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Tipomtto> findAll(){
        List listaTipomtto = null;
        try {
            if(ejbTipomtto != null){
                return ejbTipomtto.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaTipomtto;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbTipomtto != null) {
                return ejbTipomtto.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idTipomtto}")
    @Produces({MediaType.APPLICATION_JSON})
    public Tipomtto findById(@PathParam("idTipomtto") Integer idTipomtto){
        try {
            if(ejbTipomtto != null){
                ejbTipomtto.find(idTipomtto);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Tipomtto();       
    }
    
    @Path("/{idTipomtto}")
    @DELETE
    public Response remove (@PathParam("idTipomtto") Integer idTipomtto){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idTipomtto != null && this.ejbTipomtto != null){
                ejbTipomtto.remove(ejbTipomtto.find(idTipomtto));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idTipomtto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Tipomtto tipomtto){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbTipomtto!=null){
                ejbTipomtto.create(tipomtto);
                respuesta = Response.status(Response.Status.CREATED).entity(tipomtto).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idTipomtto}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idTipomtto") Integer idTipomtto, Tipomtto tipomtto) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbTipomtto != null) {
                ejbTipomtto.edit(tipomtto);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
