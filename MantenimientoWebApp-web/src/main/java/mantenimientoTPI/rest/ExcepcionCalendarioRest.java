/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.ExcepcionCalendario;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ExcepcionCalendarioFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/excepcionCalendario")
public class ExcepcionCalendarioRest {

    @EJB
    private ExcepcionCalendarioFacadeLocal ejbExcepcionCalendario;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;    
    
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
    
    @Path("/buscarporid/{id_calendarioExcepcion}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExcepcionCalendario findById(@PathParam("id_calendarioExcepcion") Integer id_calendarioEcepcion){
        if (ejbExcepcionCalendario != null) {
            return ejbExcepcionCalendario.find(id_calendarioEcepcion);
        }
        return new ExcepcionCalendario();
    }
    
    @Path("/borrar/{id_calendarioExcepcion}")
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
    @Path("/crear/{id_calendarioExcepcion}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(ExcepcionCalendario calendario){       
        ejbExcepcionCalendario.create(calendario);
        return Response.status(Response.Status.CREATED).entity(calendario).build();
    }    
    
    @Path("/modificar/{id_calendarioExcepcion}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_calendarioExcepcion") Integer id_calendarioExcepcion, ExcepcionCalendario calendario) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbExcepcionCalendario != null) {
                ejbExcepcionCalendario.edit(calendario);
                respuesta=Response.status(Response.Status.OK).entity(calendario).build();
            }
        return respuesta;
    }
    
}
