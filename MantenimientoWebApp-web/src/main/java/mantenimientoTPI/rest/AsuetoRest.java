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
import sv.edu.uesocc.ingenieria.mantenimientolib.Asuetos;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.AsuetosFacadeLocal;

/**
 *
 * @author david
 */
@Path("/asueto")
public class AsuetoRest implements Serializable{
    
    @EJB
    private AsuetosFacadeLocal ejbAsueto;
    
    @Path("/getAsueto")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Asuetos> findAll(){
        List listaAsueto = null;
        if (ejbAsueto != null) {
            return ejbAsueto.findAll();
        }
        return listaAsueto;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbAsueto != null) {
            return ejbAsueto.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_asueto}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Asuetos findById(@PathParam("id_asueto") Integer id_asueto){
        if (ejbAsueto != null) {
            return ejbAsueto.find(id_asueto);
        }
        return new Asuetos();
    }
    
    @Path("/borrar/{id_asueto}")
    @DELETE
    public Response remove(@PathParam("id_asueto") Integer id_asueto){
        Asuetos a = new Asuetos(id_asueto);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbAsueto != null) {
            ejbAsueto.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_asueto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Asuetos asueto){       
        ejbAsueto.create(asueto);
        return Response.status(Response.Status.CREATED).entity(asueto).build();
    }
    
    @Path("/modificar/{id_asueto}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_asueto") Integer id_asueto, Asuetos asueto) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbAsueto != null) {
                ejbAsueto.edit(asueto);
                respuesta=Response.status(Response.Status.OK).entity(asueto).build();
            }
        return respuesta;
    }
}
