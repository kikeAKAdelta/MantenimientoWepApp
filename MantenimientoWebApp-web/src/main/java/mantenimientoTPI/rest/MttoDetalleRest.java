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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.MttoDetalleFacadeLocal;


/**
 *
 * @author degon
 */
@Path("/mantenimientoDetalle")
public class MttoDetalleRest implements Serializable{
    
     @EJB
    private MttoDetalleFacadeLocal ejbMantenimiento;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MttoDetalle> findAll(){
        List listaArea = null;
        if (ejbMantenimiento != null) {
            return ejbMantenimiento.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbMantenimiento != null) {
            return ejbMantenimiento.count();
        }
        return 0;
    }
    
    @Path("/{id_mantenimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MttoDetalle findById(@PathParam("id_mantenimiento") Integer id_calendario){
        if (ejbMantenimiento != null) {
            return ejbMantenimiento.find(id_calendario);
        }
        return new MttoDetalle();
    }
    
    @Path("/{id_mantenimiento}")
    @DELETE
    public Response remove(@PathParam("id_mantenimiento") Integer id_mantenimiento){
        MttoDetalle a = new MttoDetalle(id_mantenimiento);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbMantenimiento != null) {
            ejbMantenimiento.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_mantenimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(MttoDetalle mantenimiento){       
        ejbMantenimiento.create(mantenimiento);
        return Response.status(Response.Status.CREATED).entity(mantenimiento).build();
    }
}
