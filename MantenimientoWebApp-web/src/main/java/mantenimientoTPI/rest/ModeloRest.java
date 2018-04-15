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
import sv.edu.uesocc.ingenieria.mantenimientolib.Modelo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ModeloFacadeLocal;

/**
 *
 * @author david
 */
@Path("/modelo")
public class ModeloRest {
    
     @EJB
    private ModeloFacadeLocal ejbModelo;
    
    @Path("/getModelo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Modelo> findAll(){
        List listaModelo = null;
        if (ejbModelo != null) {
            return ejbModelo.findAll();
        }
        return listaModelo;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbModelo != null) {
            return ejbModelo.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_modelo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Modelo findById(@PathParam("id_modelo") Integer id_modelo){
        if (ejbModelo != null) {
            return ejbModelo.find(id_modelo);
        }
        return new Modelo();
    }
    
    @Path("/borrar/{id_modelo}")
    @DELETE
    public Response remove(@PathParam("id_modelo") Integer id_modelo){
        Modelo a = new Modelo(id_modelo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbModelo != null) {
            ejbModelo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_modelo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Modelo modelo){       
        ejbModelo.create(modelo);
        return Response.status(Response.Status.CREATED).entity(modelo).build();
    }
    
    @Path("/modificar/{id_modelo}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_modelo") Integer id_modelo, Modelo modelo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbModelo != null) {
                ejbModelo.edit(modelo);
                respuesta=Response.status(Response.Status.OK).entity(modelo).build();
            }
        return respuesta;
    }
}
