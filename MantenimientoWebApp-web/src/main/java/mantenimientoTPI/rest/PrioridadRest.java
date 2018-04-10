/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.Prioridad;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PrioridadFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/prioridad")
public class PrioridadRest implements Serializable{
    @EJB
    private PrioridadFacadeLocal ejbPrioridad;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prioridad> findAll(){
        List listaPrioridad = null;
        if (ejbPrioridad != null) {
            return ejbPrioridad.findAll();
        }
        return listaPrioridad;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbPrioridad != null) {
            return ejbPrioridad.count();
        }
        return 0;
    }
    
    @Path("/{id_prioridad}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Prioridad findById(@PathParam("id_prioridad") Integer id_prioridad){
        if (ejbPrioridad != null) {
            return ejbPrioridad.find(id_prioridad);
        }
        return new Prioridad();
    }
    
    @Path("/{id_prioridad}")
    @DELETE
    public Response remove(@PathParam("id_prioridad") Integer id_prioridad){
        Prioridad a = new Prioridad(id_prioridad);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbPrioridad != null) {
            ejbPrioridad.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_prioridad}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Prioridad prioridad){       
        ejbPrioridad.create(prioridad);
        return Response.status(Response.Status.CREATED).entity(prioridad).build();
    }
    
    @Path("/{id_prioridad}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_prioridad") Integer id_prioridad, Prioridad prioridad) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbPrioridad != null) {
                ejbPrioridad.edit(prioridad);
                respuesta=Response.status(Response.Status.OK).entity(prioridad).build();
            }
        return respuesta;
    }
    
}
