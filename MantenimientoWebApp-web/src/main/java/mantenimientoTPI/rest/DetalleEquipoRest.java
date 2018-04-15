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
import sv.edu.uesocc.ingenieria.mantenimientolib.DetalleEquipo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DetalleEquipoFacadeLocal;

/**
 *
 * @author david
 */
@Path("/detalleEquipo")
public class DetalleEquipoRest {
    
     @EJB
    private DetalleEquipoFacadeLocal ejbDetalleEquipo;
    
    @Path("/getDetalleEquipo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DetalleEquipo> findAll(){
        List listaDetalleEquipo = null;
        if (ejbDetalleEquipo != null) {
            return ejbDetalleEquipo.findAll();
        }
        return listaDetalleEquipo;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbDetalleEquipo != null) {
            return ejbDetalleEquipo.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_detalleEquipo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DetalleEquipo findById(@PathParam("id_cargo") Integer id_detalleEquipo){
        if (ejbDetalleEquipo != null) {
            return ejbDetalleEquipo.find(id_detalleEquipo);
        }
        return new DetalleEquipo();
    }
    
    @Path("/borrar/{id_detalleEquipo}")
    @DELETE
    public Response remove(@PathParam("id_detalleEquipo") Integer id_detalleEquipo){
        DetalleEquipo a = new DetalleEquipo(id_detalleEquipo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbDetalleEquipo != null) {
            ejbDetalleEquipo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_detalleEquipo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(DetalleEquipo detalle){       
        ejbDetalleEquipo.create(detalle);
        return Response.status(Response.Status.CREATED).entity(detalle).build();
    }
    
    @Path("/modificar/{id_detalleEquipo}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_detalleEquipo") Integer id_detalleEquipo, DetalleEquipo detalle) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbDetalleEquipo != null) {
                ejbDetalleEquipo.edit(detalle);
                respuesta=Response.status(Response.Status.OK).entity(detalle).build();
            }
        return respuesta;
    }
}
