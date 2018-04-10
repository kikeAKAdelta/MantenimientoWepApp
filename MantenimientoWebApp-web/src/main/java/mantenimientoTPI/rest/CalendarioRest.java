/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.io.Serializable;
import java.util.Date;
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
import sv.edu.uesocc.ingenieria.tpi2018.sessions.CalendarioFacadeLocal;
import sv.edu.uesocc.ingenieria.mantenimientolib.Calendario;


/**
 *
 * @author degon
 */
@Path("/calendario")
public class CalendarioRest implements Serializable{
    @EJB
    private CalendarioFacadeLocal ejbCalendario;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Calendario> findAll(){
        List listaArea = null;
        if (ejbCalendario != null) {
            return ejbCalendario.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbCalendario != null) {
            return ejbCalendario.count();
        }
        return 0;
    }
    
    @Path("/{id_calendario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Calendario findById(@PathParam("id_calendario") Integer id_calendario){
        if (ejbCalendario != null) {
            return ejbCalendario.find(id_calendario);
        }
        return new Calendario();
    }
    
    @Path("/{id_calendario}")
    @DELETE
    public Response remove(@PathParam("id_calendario") Integer id_calendario){
        Calendario a = new Calendario(id_calendario);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbCalendario != null) {
            ejbCalendario.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_calendario}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Calendario calendario){       
        ejbCalendario.create(calendario);
        return Response.status(Response.Status.CREATED).entity(calendario).build();
    }
    
    @Path("/{id_calendario}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_calendario") Integer id_calendario, Calendario calendario) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbCalendario != null) {
                ejbCalendario.edit(calendario);
                respuesta=Response.status(Response.Status.OK).entity(calendario).build();
            }
        return respuesta;
    }
    
}
