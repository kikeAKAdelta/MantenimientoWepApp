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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EquipoFacadeLocal;

/**
 *
 * @author ricky
 * Ricardo Barrientos
 */
@Path("/equipo")
public class EquipoREST implements Serializable{
    
    @EJB 
    private EquipoFacadeLocal ejbEquipo;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Equipo> findAll(){
        List listaEquipo = null;
        try {
            if(ejbEquipo != null){
                return ejbEquipo.findAll();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return listaEquipo;
    }
    
    @Path("/count")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Integer count() {

        try {
            if (ejbEquipo != null) {
                return ejbEquipo.count();
            }

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return 0;
    }
    
    @GET
    @Path("/{idEquipo}")
    @Produces({MediaType.APPLICATION_JSON})
    public Equipo findById(@PathParam("idEquipo") Integer idEquipo){
        try {
            if(ejbEquipo != null){
                ejbEquipo.find(idEquipo);
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return new Equipo();       
    }
    
    @Path("/{idEquipo}")
    @DELETE
    public Response remove (@PathParam("idEquipo") Integer idEquipo){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if(idEquipo != null && this.ejbEquipo != null){
                ejbEquipo.remove(ejbEquipo.find(idEquipo));
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        
    return respuesta;
    }
    
    @Path("/{idEquipo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Equipo equipo){
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build(); 
        try {
            if(ejbEquipo!=null){
                ejbEquipo.create(equipo);
                respuesta = Response.status(Response.Status.CREATED).entity(equipo).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;

    }
    
    @PUT
    @Path("/{idEquipo}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("idEquipo") Integer idEquipo, Equipo equipo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        try {
            if (this.ejbEquipo != null) {
                ejbEquipo.edit(equipo);
                respuesta = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return respuesta;
    }

}
