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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.OrdenTrabajoFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/ordenTrabajo")
public class OrdenTrabajoREST implements Serializable{
    
    @EJB 
    private OrdenTrabajoFacadeLocal ejbOT;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<OrdenTrabajo> findAll(){
        List listaOT = null;
        try {
            if(ejbOT != null){
                return ejbOT.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaOT;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbOT != null) {
                return ejbOT.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idOT}")
    @Produces({MediaType.APPLICATION_JSON})
    public OrdenTrabajo findById(@PathParam("idOT") Integer idOT){
        try {
            if(ejbOT != null){
                ejbOT.find(idOT);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new OrdenTrabajo();       
    }
    
    @Path("/{idOT}")
    @DELETE
    public Response remove (@PathParam("idOT") Integer idOT){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idOT != null && this.ejbOT != null){
                ejbOT.remove(ejbOT.find(idOT));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idOT}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(OrdenTrabajo ot){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbOT!=null){
                ejbOT.create(ot);
                respuesta = Response.status(Response.Status.CREATED).entity(ot).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idOT}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idOT") Integer idOT, OrdenTrabajo ot) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbOT != null) {
                ejbOT.edit(ot);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
