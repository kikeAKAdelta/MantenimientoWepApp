/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.io.Serializable;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.OrdenTrabajoFacadeLocal;


/**
 *
 * @author degon
 */
@Path("ordenTrabajo")
public class OrdenTrabajoRest implements Serializable{
    
    @EJB
    private OrdenTrabajoFacadeLocal ejbOrdenTrabajo;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrdenTrabajo> findAll(){
        List listaOrdenTrabajo = null;
        if (ejbOrdenTrabajo != null) {
            return ejbOrdenTrabajo.findAll();
        }
        return listaOrdenTrabajo;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbOrdenTrabajo != null) {
            return ejbOrdenTrabajo.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_ordenTrabajo}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public OrdenTrabajo findById(@PathParam("id_ordenTrabajo") Integer id_ordenTrabajo){
        if (ejbOrdenTrabajo != null) {
            return ejbOrdenTrabajo.find(id_ordenTrabajo);
        }
        return new OrdenTrabajo();
    }
    
    @Path("/borrar/{id_ordenTrabajo}")
    @DELETE
    public Response remove(@PathParam("id_ordenTrabajo") Integer id_OrdenTrabajo){
        OrdenTrabajo a = new OrdenTrabajo(id_OrdenTrabajo);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbOrdenTrabajo != null) {
            ejbOrdenTrabajo.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_ordenTrabajo}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(OrdenTrabajo orden){       
        ejbOrdenTrabajo.create(orden);
        return Response.status(Response.Status.CREATED).entity(orden).build();
    }
    
    @Path("/modificar/{id_ordenTrabajo}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_ordenTrabajo") Integer id_ordenTrabajo, OrdenTrabajo ordenTrabajo) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbOrdenTrabajo != null) {
                ejbOrdenTrabajo.edit(ordenTrabajo);
                respuesta = Response.status(Response.Status.OK).build();
            }
        return respuesta;
    }
    
}
