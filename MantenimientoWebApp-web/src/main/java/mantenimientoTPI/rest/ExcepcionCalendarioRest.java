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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.ExcepcionCalendario;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ExcepcionCalendarioFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/excepcionCalendario")
public class ExcepcionCalendarioRest {

    @EJB
    private ExcepcionCalendarioFacadeLocal ejbExcepcionCalendario;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ExcepcionCalendario> findAll(){
        List listaArea = null;
        if (ejbExcepcionCalendario != null) {
            return ejbExcepcionCalendario.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbExcepcionCalendario != null) {
            return ejbExcepcionCalendario.count();
        }
        return 0;
    }
    
    @Path("/{id_calendarioExcepcion}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExcepcionCalendario findById(@PathParam("id_calendarioExcepcion") Integer id_calendarioEcepcion){
        if (ejbExcepcionCalendario != null) {
            return ejbExcepcionCalendario.find(id_calendarioEcepcion);
        }
        return new ExcepcionCalendario();
    }
    
    @Path("/{id_calendarioExcepcion}")
    @DELETE
    public Response remove(@PathParam("id_calendario") Integer id_calendarioExcepcion){
        ExcepcionCalendario a = new ExcepcionCalendario(id_calendarioExcepcion);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbExcepcionCalendario != null) {
            ejbExcepcionCalendario.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_calendarioExcepcion}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(ExcepcionCalendario calendario){       
        ejbExcepcionCalendario.create(calendario);
        return Response.status(Response.Status.CREATED).entity(calendario).build();
    }    
}
