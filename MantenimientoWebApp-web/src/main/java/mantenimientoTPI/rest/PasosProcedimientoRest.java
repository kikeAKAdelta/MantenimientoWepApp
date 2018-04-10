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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.PasosProcedimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PasosProcedimientoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/pasosProcedimiento")
public class PasosProcedimientoRest implements Serializable
{
    @EJB
    private PasosProcedimientoFacadeLocal ebjPasosProcedimiento;
    
    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-web_war_1.0-SNAPSHOTPU")
    private EntityManager em = null;    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PasosProcedimiento> findAll(){
        List listaPasosProcedimiento = null;
        if (ebjPasosProcedimiento != null) {
            return ebjPasosProcedimiento.findAll();
        }
        return listaPasosProcedimiento;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ebjPasosProcedimiento != null) {
            return ebjPasosProcedimiento.count();
        }
        return 0;
    }
    
    @Path("/buscarporid/{id_pasosProcedimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PasosProcedimiento findById(@PathParam("id_pasosProcedimiento") Integer id_pasosProcedimiento){
        if (ebjPasosProcedimiento != null) {
            return ebjPasosProcedimiento.find(id_pasosProcedimiento);
        }
        return new PasosProcedimiento();
    }
    
    @Path("/borrar/{id_pasosProcedimiento}")
    @DELETE
    public Response remove(@PathParam("id_pasosProcedimiento") Integer id_pasosProcedimiento){
        PasosProcedimiento a = new PasosProcedimiento(id_pasosProcedimiento);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ebjPasosProcedimiento != null) {
            ebjPasosProcedimiento.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/crear/{id_pasosProcedimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(PasosProcedimiento pasosProcedimiento){       
        ebjPasosProcedimiento.create(pasosProcedimiento);
        return Response.status(Response.Status.CREATED).entity(pasosProcedimiento).build();
    }
    
    @Path("/modificar/{id_pasosProcedimiento}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_pasosProcedimiento") Integer id_pasosProcedimiento, PasosProcedimiento pasosProcedimiento) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ebjPasosProcedimiento != null) {
                ebjPasosProcedimiento.edit(pasosProcedimiento);
                respuesta = Response.status(Response.Status.OK).build();
            }
        return respuesta;
    }
}
