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
import sv.edu.uesocc.ingenieria.mantenimientolib.Responsable;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ResponsableFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/responsable")
public class ResponsableRest implements Serializable{
    @EJB
    private ResponsableFacadeLocal ejbResponsable;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Responsable> findAll(){
        List listaResponsable = null;
        if (ejbResponsable != null) {
            return ejbResponsable.findAll();
        }
        return listaResponsable;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbResponsable != null) {
            return ejbResponsable.count();
        }
        return 0;
    }
    
    @Path("/{id_responsable}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Responsable findById(@PathParam("id_responsable") Integer id_responsable){
        if (ejbResponsable != null) {
            return ejbResponsable.find(id_responsable);
        }
        return new Responsable();
    }
    
    @Path("/{id_responsable}")
    @DELETE
    public Response remove(@PathParam("id_responsable") Integer id_responsable){
        Responsable a = new Responsable(id_responsable);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbResponsable != null) {
            ejbResponsable.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_responsable}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Responsable responsable){       
        ejbResponsable.create(responsable);
        return Response.status(Response.Status.CREATED).entity(responsable).build();
    }
}
