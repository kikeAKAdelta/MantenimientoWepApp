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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.SubtipoMtto;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.SubtipoMttoFacadeLocal;

/**
 *
 * @author ivan
 */
@Path("/subtipoMtto")
public class SubtipoMttoREST implements Serializable{
    
    @EJB 
    private SubtipoMttoFacadeLocal ejbSubtipoMtto;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<SubtipoMtto> findAll(){
        List listaSubtipoMtto = null;
        try {
            if(ejbSubtipoMtto != null){
                return ejbSubtipoMtto.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaSubtipoMtto;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbSubtipoMtto != null) {
                return ejbSubtipoMtto.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idSubtipoMtto}")
    @Produces({MediaType.APPLICATION_JSON})
    public SubtipoMtto findById(@PathParam("idSubtipoMtto") Integer idSubtipoMtto){
        try {
            if(ejbSubtipoMtto != null){
                ejbSubtipoMtto.find(idSubtipoMtto);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new SubtipoMtto();       
    }
    
    @Path("/{idSubtipoMtto}")
    @DELETE
    public Response remove (@PathParam("idSubtipoMtto") Integer idSubtipoMtto){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idSubtipoMtto != null && this.ejbSubtipoMtto != null){
                ejbSubtipoMtto.remove(ejbSubtipoMtto.find(idSubtipoMtto));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idSubtipoMtto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(SubtipoMtto subtipoMtto){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbSubtipoMtto!=null){
                ejbSubtipoMtto.create(subtipoMtto);
                respuesta = Response.status(Response.Status.CREATED).entity(subtipoMtto).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idSubtipoMtto}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idSubtipoMtto") Integer idSubtipoMtto, SubtipoMtto subtipoMtto) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbSubtipoMtto != null) {
                ejbSubtipoMtto.edit(subtipoMtto);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
