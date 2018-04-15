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
import sv.edu.uesocc.ingenieria.mantenimientolib.Marca;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.MarcaFacadeLocal;

/**
 *
 * @author david
 */
@Path("/marca")
public class MarcaRest {
    
     @EJB
    private MarcaFacadeLocal ejbMarca;
    
    @Path("/getMarca")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Marca> findAll(){
        List listaMarca = null;
        if (ejbMarca != null) {
            return ejbMarca.findAll();
        }
        return listaMarca;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbMarca != null) {
            return ejbMarca.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_marca}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Marca findById(@PathParam("id_marca") Integer id_marca){
        if (ejbMarca != null) {
            return ejbMarca.find(id_marca);
        }
        return new Marca();
    }
    
    @Path("/borrar/{id_marca}")
    @DELETE
    public Response remove(@PathParam("id_marca") Integer id_marca){
        Marca a = new Marca(id_marca);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbMarca != null) {
            ejbMarca.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_marca}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Marca marca){       
        ejbMarca.create(marca);
        return Response.status(Response.Status.CREATED).entity(marca).build();
    }
    
    @Path("/modificar/{id_marca}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_marca") Integer id_marca, Marca marca) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbMarca != null) {
                ejbMarca.edit(marca);
                respuesta=Response.status(Response.Status.OK).entity(marca).build();
            }
        return respuesta;
    }
}
