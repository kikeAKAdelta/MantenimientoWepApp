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
import sv.edu.uesocc.ingenieria.mantenimientolib.Solicitud;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.SolicitudFacadeLocal;


/**
 *
 * @author degon
 */
@Path("/solicitud")
public class SolicitudRest implements Serializable{
    @EJB
    private SolicitudFacadeLocal ejbSolicitud;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Solicitud> findAll(){
        List listaSolicitud = null;
        if (ejbSolicitud != null) {
            return ejbSolicitud.findAll();
        }
        return listaSolicitud;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbSolicitud != null) {
            return ejbSolicitud.count();
        }
        return 0;
    }
    
    @Path("/{id_solicitud}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Solicitud findById(@PathParam("id_solicitud") Integer id_solicitud){
        if (ejbSolicitud != null) {
            return ejbSolicitud.find(id_solicitud);
        }
        return new Solicitud();
    }
    
    @Path("/{id_solicitud}")
    @DELETE
    public Response remove(@PathParam("id_solicitud") Integer id_solicitud){
        Solicitud a = new Solicitud(id_solicitud);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbSolicitud != null) {
            ejbSolicitud.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_solicitud}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Solicitud solicitud){       
        ejbSolicitud.create(solicitud);
        return Response.status(Response.Status.CREATED).entity(solicitud).build();
    }
    
    @Path("/{id_solicitud}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_solicitud") Integer id_solicitud, Solicitud solicitud) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbSolicitud != null) {
                ejbSolicitud.edit(solicitud);
                respuesta=Response.status(Response.Status.OK).entity(solicitud).build();
            }
        return respuesta;
    }
    
}
