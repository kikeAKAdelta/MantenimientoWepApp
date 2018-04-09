/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import java.util.Date;
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
import sv.edu.uesocc.ingenieria.mantenimientolib.PasosProcedimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.PasosProcedimientoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/pasosProcedimiento")
public class PasosProcedimientoRest {
    @EJB
    private PasosProcedimientoFacadeLocal ebjPasosProcedimiento;
    
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
    
    @Path("/{id_pasosProcedimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PasosProcedimiento findById(@PathParam("id_pasosProcedimiento") Integer id_pasosProcedimiento){
        if (ebjPasosProcedimiento != null) {
            return ebjPasosProcedimiento.find(id_pasosProcedimiento);
        }
        return new PasosProcedimiento();
    }
    
    @Path("/{id_pasosProcedimiento}")
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
    @Path("/{id_pasosProcedimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(PasosProcedimiento pasosProcedimiento){       
        ebjPasosProcedimiento.create(pasosProcedimiento);
        return Response.status(Response.Status.CREATED).entity(pasosProcedimiento).build();
    }
}
