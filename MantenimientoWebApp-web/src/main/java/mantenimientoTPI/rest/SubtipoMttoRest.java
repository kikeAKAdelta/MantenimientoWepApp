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
import sv.edu.uesocc.ingenieria.mantenimientolib.SubtipoMtto;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.SubtipoMttoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/subTipoMantenimiento")
public class SubtipoMttoRest implements Serializable{
    @EJB
    private SubtipoMttoFacadeLocal ejbSubtipoMtto;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SubtipoMtto> findAll(){
        List listaArea = null;
        if (ejbSubtipoMtto != null) {
            return ejbSubtipoMtto.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbSubtipoMtto != null) {
            return ejbSubtipoMtto.count();
        }
        return 0;
    }
    
    @Path("/{id_subtipoMtto}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SubtipoMtto findById(@PathParam("id_subtipoMtto") Integer id_SubtipoMtto){
        if (ejbSubtipoMtto != null) {
            return ejbSubtipoMtto.find(id_SubtipoMtto);
        }
        return new SubtipoMtto();
    }
    
    @Path("/{id_subtipoMtto}")
    @DELETE
    public Response remove(@PathParam("id_subTipoMtto") Integer id_subTipoMtto, 
            @PathParam("id_tipoMtto") Integer id_tipoMtto){
        SubtipoMtto a = new SubtipoMtto(id_subTipoMtto, id_tipoMtto);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbSubtipoMtto != null) {
            ejbSubtipoMtto.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_subtipoMtto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(SubtipoMtto SubtipoMtto){       
        ejbSubtipoMtto.create(SubtipoMtto);
        return Response.status(Response.Status.CREATED).entity(SubtipoMtto).build();
    }
    
    @Path("/{id_subtipoMtto}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_subtipoMtto") Integer id_subtipoMtto, SubtipoMtto subtipoMtto) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbSubtipoMtto != null) {
                ejbSubtipoMtto.edit(subtipoMtto);
                respuesta = Response.status(Response.Status.OK).build();
            }
        return respuesta;
    }
    
}
