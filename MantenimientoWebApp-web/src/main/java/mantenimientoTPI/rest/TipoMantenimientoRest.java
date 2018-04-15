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
import sv.edu.uesocc.ingenieria.mantenimientolib.Cargo;
import sv.edu.uesocc.ingenieria.mantenimientolib.TipoMantenimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.TipoMantenimientoFacadeLocal;

/**
 *
 * @author david
 */
@Path("/tipoMantenimiento")
public class TipoMantenimientoRest {
    
     @EJB
    private TipoMantenimientoFacadeLocal ejbTipoMantenimiento;
    
    @Path("/getTipoMantenimiento")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TipoMantenimiento> findAll(){
        List listaCargo = null;
        if (ejbTipoMantenimiento != null) {
            return ejbTipoMantenimiento.findAll();
        }
        return listaCargo;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbTipoMantenimiento != null) {
            return ejbTipoMantenimiento.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_tipoMantenimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TipoMantenimiento findById(@PathParam("id_tipoMantenimiento") Integer id_tipoMantenimiento){
        if (ejbTipoMantenimiento != null) {
            return ejbTipoMantenimiento.find(id_tipoMantenimiento);
        }
        return new TipoMantenimiento();
    }
    
    @Path("/borrar/{id_tipoMantenimiento}")
    @DELETE
    public Response remove(@PathParam("id_tipoMantenimiento") Integer id_tipoMantenimiento){
        TipoMantenimiento a = new TipoMantenimiento(id_tipoMantenimiento);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbTipoMantenimiento != null) {
            ejbTipoMantenimiento.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_tipoMantenimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(TipoMantenimiento tipo){       
        ejbTipoMantenimiento.create(tipo);
        return Response.status(Response.Status.CREATED).entity(tipo).build();
    }
    
    @Path("/modificar/{id_tipoMantenimiento}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_tipoMantenimiento") Integer id_tipoMantenimiento, TipoMantenimiento tipo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbTipoMantenimiento != null) {
                ejbTipoMantenimiento.edit(tipo);
                respuesta=Response.status(Response.Status.OK).entity(tipo).build();
            }
        return respuesta;
    }
}
