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
import sv.edu.uesocc.ingenieria.mantenimientolib.DetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DetalleOrdenTrabajoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/detalleOrdenTrabajo")
public class DetalleOrdenTrabajoRest implements Serializable{
    @EJB
    private DetalleOrdenTrabajoFacadeLocal ejbDetalleOrden;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DetalleOrdenTrabajo> findAll(){
        List listaArea = null;
        if (ejbDetalleOrden != null) {
            return ejbDetalleOrden.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbDetalleOrden != null) {
            return ejbDetalleOrden.count();
        }
        return 0;
    }
    
    @Path("/{id_detalle_orden_trabajo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DetalleOrdenTrabajo findById(@PathParam("id_detalle_orden_trabajo") Integer id_calendario){
        if (ejbDetalleOrden != null) {
            return ejbDetalleOrden.find(id_calendario);
        }
        return new DetalleOrdenTrabajo();
    }
    
    @Path("/{id_detalle_orden_trabajo}")
    @DELETE
    public Response remove(@PathParam("id_detalle_orden_trabajo") Integer id_detalle_orden_trabajo){
        DetalleOrdenTrabajo a = new DetalleOrdenTrabajo(id_detalle_orden_trabajo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbDetalleOrden != null) {
            ejbDetalleOrden.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_detalle_orden_trabajo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(DetalleOrdenTrabajo detalleOrdenTrabajo){       
        ejbDetalleOrden.create(detalleOrdenTrabajo);
        return Response.status(Response.Status.CREATED).entity(detalleOrdenTrabajo).build();
    }
}
