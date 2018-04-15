/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

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
import sv.edu.uesocc.ingenieria.mantenimientolib.Trabajadores;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.TrabajadoresFacadeLocal;

/**
 *
 * @author david
 */
@Path("/trabajadores")
public class TrabajadoresRest {
    
     @EJB
    private TrabajadoresFacadeLocal ejbTrabajadores;
    
    @Path("/getTrabajadores")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Trabajadores> findAll(){
        List listaTrabajadores = null;
        if (ejbTrabajadores != null) {
            return ejbTrabajadores.findAll();
        }
        return listaTrabajadores;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbTrabajadores != null) {
            return ejbTrabajadores.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_trabajadores}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Trabajadores findById(@PathParam("id_trabajadores") Integer id_trabajadores){
        if (ejbTrabajadores != null) {
            return ejbTrabajadores.find(id_trabajadores);
        }
        return new Trabajadores();
    }
    
    @Path("/borrar/{id_trabajadores}")
    @DELETE
    public Response remove(@PathParam("id_trabajadores") Integer id_trabajadores){
        Trabajadores a = new Trabajadores(id_trabajadores);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbTrabajadores != null) {
            ejbTrabajadores.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_trabajadores}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Trabajadores trabajadores){       
        ejbTrabajadores.create(trabajadores);
        return Response.status(Response.Status.CREATED).entity(trabajadores).build();
    }
    
    @Path("/modificar/{id_trabajadores}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_trabajadores") Integer id_trabajadores, Trabajadores trabajadores) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbTrabajadores != null) {
                ejbTrabajadores.edit(trabajadores);
                respuesta=Response.status(Response.Status.OK).entity(trabajadores).build();
            }
        return respuesta;
    }
}
