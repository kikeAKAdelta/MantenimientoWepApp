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
import sv.edu.uesocc.ingenieria.mantenimientolib.Estado;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EstadoFacadeLocal;

/**
 *
 * @author degon
 */

@Path("/estado")
public class EstadoRest implements Serializable{
    
    @EJB
    private EstadoFacadeLocal ejbEstado;
     
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estado> findAll(){
        List listaArea = null;
        if (ejbEstado != null) {
            return ejbEstado.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbEstado != null) {
            return ejbEstado.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_estado}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Estado findById(@PathParam("id_estado") Integer id_estado){
        if (ejbEstado != null) {
            return ejbEstado.find(id_estado);
        }
        return new Estado();
    }
    
    @Path("/borrar/{id_estado}")
    @DELETE
    public Response remove(@PathParam("id_estado") Integer id_estado){
        Estado a = new Estado(id_estado);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbEstado != null) {
            ejbEstado.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_estado}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Estado estado){       
        ejbEstado.create(estado);
        return Response.status(Response.Status.CREATED).entity(estado).build();
    }
    
    @Path("/modificar/{id_estado}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_estado") Integer id_estado, Estado estado) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbEstado != null) {
                ejbEstado.edit(estado);
                respuesta=Response.status(Response.Status.OK).entity(estado).build();
            }
        return respuesta;
    }
    
}
