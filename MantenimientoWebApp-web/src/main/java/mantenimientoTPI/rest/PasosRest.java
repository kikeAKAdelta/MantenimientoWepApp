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
import sv.edu.uesocc.ingenieria.mantenimientolib.Pasos;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PasosFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/pasos")
public class PasosRest implements Serializable{
    
    @EJB
    private PasosFacadeLocal ejbPasos;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pasos> findAll(){
        List listaPasos = null;
        if (ejbPasos != null) {
            return ejbPasos.findAll();
        }
        return listaPasos;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbPasos != null) {
            return ejbPasos.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_pasos}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pasos findById(@PathParam("id_pasos") Integer id_pasos){
        if (ejbPasos != null) {
            return ejbPasos.find(id_pasos);
        }
        return new Pasos();
    }
    
    @Path("/borrar/{id_pasos}")
    @DELETE
    public Response remove(@PathParam("id_pasos") Integer id_pasos){
        Pasos a = new Pasos(id_pasos);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbPasos != null) {
            ejbPasos.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_pasos}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Pasos pasos){       
        ejbPasos.create(pasos);
        return Response.status(Response.Status.CREATED).entity(pasos).build();
    }
    
    @Path("/modificar/{id_pasos}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_pasos") Integer id_pasos, Pasos pasos) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbPasos != null) {
                ejbPasos.edit(pasos);
                respuesta=Response.status(Response.Status.OK).entity(pasos).build();
            }
        return respuesta;
    }
}
