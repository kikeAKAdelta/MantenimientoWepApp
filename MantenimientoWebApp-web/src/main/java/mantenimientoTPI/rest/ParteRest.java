    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.io.Serializable;
import java.util.List;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.Parte;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ParteFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/parte")
public class ParteRest implements Serializable{
    
    @EJB
    private ParteFacadeLocal ejbParte;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parte> findAll(){
        List listaParte = null;
        if (ejbParte != null) {
            return ejbParte.findAll();
        }
        return listaParte;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbParte != null) {
            return ejbParte.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_parte}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Parte findById(@PathParam("id_parte") Integer id_parte){
        if (ejbParte != null) {
            return ejbParte.find(id_parte);
        }
        return new Parte();
    }
    
    @Path("/borrar/{id_parte}")
    @DELETE
    public Response remove(@PathParam("id_parte") Integer id_parte){
        Parte a = new Parte(id_parte);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbParte != null) {
            ejbParte.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_parte}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Parte parte){       
        ejbParte.create(parte);
        return Response.status(Response.Status.CREATED).entity(parte).build();
    }
    
    @Path("/modificar/{id_parte}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_parte") Integer id_parte, Parte parte) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbParte != null) {
                ejbParte.edit(parte);
                respuesta=Response.status(Response.Status.OK).entity(parte).build();
            }
        return respuesta;
    }
    
}
