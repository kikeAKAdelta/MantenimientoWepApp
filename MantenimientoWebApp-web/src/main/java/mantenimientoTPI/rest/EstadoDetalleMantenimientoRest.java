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
import sv.edu.uesocc.ingenieria.mantenimientolib.EstadoDetalleMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EstadoDetalleMantenimientoFacadeLocal;

/**
 *
 * @author david
 */
@Path("/estadoDetalleMantenimiento")
public class EstadoDetalleMantenimientoRest {
    
     @EJB
    private EstadoDetalleMantenimientoFacadeLocal ejbEstadoDetalleMantenimiento;
    
    @Path("/getCargo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EstadoDetalleMantenimiento> findAll(){
        List listaEstadoDetalleMantenimiento = null;
        if (ejbEstadoDetalleMantenimiento != null) {
            return ejbEstadoDetalleMantenimiento.findAll();
        }
        return listaEstadoDetalleMantenimiento;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbEstadoDetalleMantenimiento != null) {
            return ejbEstadoDetalleMantenimiento.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_estadoDetalleMantenimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EstadoDetalleMantenimiento findById(@PathParam("id_estadoDetalleMantenimiento") Integer id_estadoDetalleMantenimiento){
        if (ejbEstadoDetalleMantenimiento != null) {
            return ejbEstadoDetalleMantenimiento.find(id_estadoDetalleMantenimiento);
        }
        return new EstadoDetalleMantenimiento();
    }
    
    @Path("/borrar/{id_estadoDetalleMantenimiento}")
    @DELETE
    public Response remove(@PathParam("id_estadoDetalleMantenimiento") Integer id_estadoDetalleMantenimiento){
        EstadoDetalleMantenimiento a = new EstadoDetalleMantenimiento(id_estadoDetalleMantenimiento);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbEstadoDetalleMantenimiento != null) {
            ejbEstadoDetalleMantenimiento.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_estadoDetalleMantenimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(EstadoDetalleMantenimiento estado){       
        ejbEstadoDetalleMantenimiento.create(estado);
        return Response.status(Response.Status.CREATED).entity(estado).build();
    }
    
    @Path("/modificar/{id_estadoDetalleMantenimiento}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_estadoDetalleMantenimiento") Integer id_estadoDetalleMantenimiento, EstadoDetalleMantenimiento estado) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbEstadoDetalleMantenimiento != null) {
                ejbEstadoDetalleMantenimiento.edit(estado);
                respuesta=Response.status(Response.Status.OK).entity(estado).build();
            }
        return respuesta;
    }
}
