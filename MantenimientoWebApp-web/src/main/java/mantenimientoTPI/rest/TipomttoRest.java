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
import sv.edu.uesocc.ingenieria.mantenimientolib.Tipomtto;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.TipomttoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/tipoMantenimiento")
public class TipomttoRest implements Serializable{

    //@EJB
    @EJB(name="ejb/stateless")
    private TipomttoFacadeLocal ejbTipoMtto;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tipomtto> findAll(){
        List listaTipoMtto = null;
        if (ejbTipoMtto != null) {
            return ejbTipoMtto.findAll();
        }
        return listaTipoMtto;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbTipoMtto != null) {
            return ejbTipoMtto.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_tipoMtto}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Tipomtto findById(@PathParam("id_tipoMtto") Integer id_tipoMtto){
        if (ejbTipoMtto != null) {
            return ejbTipoMtto.find(id_tipoMtto);
        }
        return new Tipomtto();
    }
    
    @Path("/borrar/{id_tipoMtto}")
    @DELETE
    public Response remove(@PathParam("id_tipoMtto") Integer id_tipoMtto){
        Tipomtto a = new Tipomtto(id_tipoMtto);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbTipoMtto != null) {
            ejbTipoMtto.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_tipoMtto}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Tipomtto tipoMtto){       
        ejbTipoMtto.create(tipoMtto);
        return Response.status(Response.Status.CREATED).entity(tipoMtto).build();
    }
    
    @Path("/modificar/{id_tipoMtto}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_tipoMtto") Integer id_tipoMtto, Tipomtto tipomtto) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbTipoMtto != null) {
                ejbTipoMtto.edit(tipomtto);
                respuesta=Response.status(Response.Status.OK).entity(tipomtto).build();
            }
        return respuesta;
    }
    
}
