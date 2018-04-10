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
import sv.edu.uesocc.ingenieria.mantenimientolib.DiagnosticoParte;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.DiagnosticoParteFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/diagnosticoParte")
public class DiagnosticoParteRest implements Serializable{
    
    @EJB
    private DiagnosticoParteFacadeLocal ejbDiagnosticoParte;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DiagnosticoParte> findAll(){
        List listaArea = null;
        if (ejbDiagnosticoParte != null) {
            return ejbDiagnosticoParte.findAll();
        }
        return listaArea;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbDiagnosticoParte != null) {
            return ejbDiagnosticoParte.count();
        }
        return 0;
    }
    
    @Path("/{id_diagnosticoParte}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DiagnosticoParte findById(@PathParam("id_diagnosticoParte") Integer id_diagnosticoParte){
        if (ejbDiagnosticoParte != null) {
            return ejbDiagnosticoParte.find(ejbDiagnosticoParte);
        }
        return new DiagnosticoParte();
    }
    
    @Path("/{id_diagnosticoParte}")
    @DELETE
    public Response remove(@PathParam("id_diagnostico") Integer id_diagnostico, 
            @PathParam("id_parte") Integer id_parte){
        DiagnosticoParte a = new DiagnosticoParte(id_diagnostico, id_parte);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbDiagnosticoParte != null) {
            ejbDiagnosticoParte.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_diagnosticoParte}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(DiagnosticoParte diagnostico){       
        ejbDiagnosticoParte.create(diagnostico);
        return Response.status(Response.Status.CREATED).entity(diagnostico).build();
    }
    
    @Path("/{id_diagnosticoParte}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response edit(@PathParam("id_diagnosticoParte") Integer id_diagnosticoParte, DiagnosticoParte diagnostico) {
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
            if (this.ejbDiagnosticoParte != null) {
                ejbDiagnosticoParte.edit(diagnostico);
                respuesta = Response.status(Response.Status.OK).build();
            }
        return respuesta;
    }
    
}
