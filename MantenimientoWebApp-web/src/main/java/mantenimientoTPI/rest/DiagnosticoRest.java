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
import sv.edu.uesocc.ingenieria.mantenimientolib.Diagnostico;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DiagnosticoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/diagnostico")
public class DiagnosticoRest {
    
    @EJB
    private DiagnosticoFacadeLocal ejbDiagnostico;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Diagnostico> findAll(){
        List listaArea = null;
        if (ejbDiagnostico != null) {
            return ejbDiagnostico.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbDiagnostico != null) {
            return ejbDiagnostico.count();
        }
        return 0;
    }
    
    @Path("/{id_diagnostico}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Diagnostico findById(@PathParam("id_diagnostico") Integer id_diagnostico){
        if (ejbDiagnostico != null) {
            return ejbDiagnostico.find(id_diagnostico);
        }
        return new Diagnostico();
    }
    
    @Path("/{id_diagnostico}")
    @DELETE
    public Response remove(@PathParam("id_diagnostico") Integer id_diagnostico){
        Diagnostico a = new Diagnostico(id_diagnostico);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbDiagnostico != null) {
            ejbDiagnostico.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_diagnostico}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Diagnostico diagnostico){       
        ejbDiagnostico.create(diagnostico);
        return Response.status(Response.Status.CREATED).entity(diagnostico).build();
    }
    @Path("/{id_diagnostico}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_diagnostico") Integer id_diagnostico, Diagnostico diagnostico) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbDiagnostico != null) {
                ejbDiagnostico.edit(diagnostico);
                respuesta = Response.status(Response.Status.OK).build();
            }
        return respuesta;
    }
    
    
}
