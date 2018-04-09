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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.mantenimientolib.EstadoDetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EstadoDetalleOrdenTrabajoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/estadoDetalle")
public class EstadoDetalleOrdeTrabajoRest implements Serializable{
    
     @EJB
    private EstadoDetalleOrdenTrabajoFacadeLocal ejbEstadoDetalleOrdenTrabajo;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EstadoDetalleOrdenTrabajo> findAll(){
        List listaArea = null;
        if (ejbEstadoDetalleOrdenTrabajo != null) {
            return ejbEstadoDetalleOrdenTrabajo.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbEstadoDetalleOrdenTrabajo != null) {
            return ejbEstadoDetalleOrdenTrabajo.count();
        }
        return 0;
    }
    
    @Path("/{id_estadoDetalleOrdenTrabajo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EstadoDetalleOrdenTrabajo findById(@PathParam("id_estadoDetalleOrdenTrabajo") Integer id_estadoDetalleOrdenTrabajo){
        if (ejbEstadoDetalleOrdenTrabajo != null) {
            return ejbEstadoDetalleOrdenTrabajo.find(id_estadoDetalleOrdenTrabajo);
        }
        return new EstadoDetalleOrdenTrabajo();
    }
    
    @Path("/{id_calendario}")
    @DELETE
    public Response remove(@PathParam("id_estadoDetalleOrdenTrabajo") Integer id_estadoDetalleOrdenTrabajo){
        EstadoDetalleOrdenTrabajo a = new EstadoDetalleOrdenTrabajo(id_estadoDetalleOrdenTrabajo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbEstadoDetalleOrdenTrabajo != null) {
            ejbEstadoDetalleOrdenTrabajo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_estadoDetalleOrdenTrabajo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(EstadoDetalleOrdenTrabajo estadoDetalleOrdenTrabajo){       
        ejbEstadoDetalleOrdenTrabajo.create(estadoDetalleOrdenTrabajo);
        return Response.status(Response.Status.CREATED).entity(estadoDetalleOrdenTrabajo).build();
    }
}
