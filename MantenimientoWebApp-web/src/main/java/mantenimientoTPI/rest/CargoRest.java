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
import sv.edu.uesocc.ingenieria.tpi2018.sessions.CargoFacadeLocal;

/**
 *
 * @author david
 */
@Path("/cargo")
public class CargoRest {
 
    @EJB
    private CargoFacadeLocal ejbCargo;
    
    @Path("/getCargo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cargo> findAll(){
        List listaCargo = null;
        if (ejbCargo != null) {
            return ejbCargo.findAll();
        }
        return listaCargo;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbCargo != null) {
            return ejbCargo.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_cargo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Cargo findById(@PathParam("id_cargo") Integer id_cargo){
        if (ejbCargo != null) {
            return ejbCargo.find(id_cargo);
        }
        return new Cargo();
    }
    
    @Path("/borrar/{id_cargo}")
    @DELETE
    public Response remove(@PathParam("id_cargo") Integer id_cargo){
        Cargo a = new Cargo(id_cargo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbCargo != null) {
            ejbCargo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_cargo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Cargo cargo){       
        ejbCargo.create(cargo);
        return Response.status(Response.Status.CREATED).entity(cargo).build();
    }
    
    @Path("/modificar/{id_cargo}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_cargo") Integer id_cargo, Cargo cargo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbCargo != null) {
                ejbCargo.edit(cargo);
                respuesta=Response.status(Response.Status.OK).entity(cargo).build();
            }
        return respuesta;
    }
}
