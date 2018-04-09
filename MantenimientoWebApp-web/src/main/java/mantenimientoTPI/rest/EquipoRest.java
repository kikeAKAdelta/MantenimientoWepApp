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
import sv.edu.uesocc.ingenieria.mantenimientolib.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.EquipoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/equipo")
public class EquipoRest implements Serializable{
    
    @EJB
    private EquipoFacadeLocal ejbEquipo;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Equipo> findAll(){
        List listaArea = null;
        if (ejbEquipo != null) {
            return ejbEquipo.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbEquipo != null) {
            return ejbEquipo.count();
        }
        return 0;
    }
    
    @Path("/{id_calendario}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Equipo findById(@PathParam("id_equipo") Integer id_equipo){
        if (ejbEquipo != null) {
            return ejbEquipo.find(id_equipo);
        }
        return new Equipo();
    }
    
    @Path("/{id_equipo}")
    @DELETE
    public Response remove(@PathParam("id_equipo") Integer id_equipo){
        Equipo a = new Equipo(id_equipo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbEquipo != null) {
            ejbEquipo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_calendario}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Equipo equipo){       
        ejbEquipo.create(equipo);
        return Response.status(Response.Status.CREATED).entity(equipo).build();
    }
}
