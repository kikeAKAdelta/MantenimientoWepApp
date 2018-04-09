/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.util.Date;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.Unidad;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.UnidadFacadeLocal;

/**
 *
 * @author david
 */
public class UnidadRest {
    @EJB
    private UnidadFacadeLocal ejbUnidad;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Unidad> findAll(){
        List listaArea = null;
        if (ejbUnidad != null) {
            return ejbUnidad.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbUnidad != null) {
            return ejbUnidad.count();
        }
        return 0;
    }
    
    @Path("/{id_unidad}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Unidad findById(@PathParam("id_unidad") Integer id_unidad){
        if (ejbUnidad != null) {
            return ejbUnidad.find(id_unidad);
        }
        return new Unidad();
    }
    
    @Path("/{id_unidad}")
    @DELETE
    public Response remove(@PathParam("id_unidad") Integer id_unidad){
        Unidad a = new Unidad(id_unidad);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbUnidad != null) {
            ejbUnidad.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_unidad}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Unidad unidad){       
        ejbUnidad.create(unidad);
        return Response.status(Response.Status.CREATED).entity(unidad).build();
    }
}
