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
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sv.edu.uesocc.ingenieria.mantenimientolib.Procedimiento;
import sv.edu.uesocc.ingenieria.tpi2018.sessions.ProcedimientoFacadeLocal;

/**
 *
 * @author degon
 */
@Path("/procedimiento")
public class ProcedimientoRest implements Serializable{
    @EJB
    private ProcedimientoFacadeLocal ejbProcedimiento;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Procedimiento> findAll(){
        List listaProcedimiento = null;
        if (ejbProcedimiento != null) {
            return ejbProcedimiento.findAll();
        }
        return listaProcedimiento;
    }
    
    @Path("/count")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Integer count(){
        if (ejbProcedimiento != null) {
            return ejbProcedimiento.count();
        }
        return 0;
    }
    
    @Path("/{id_procedimiento}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Procedimiento findById(@PathParam("id_procedimiento") Integer id_procedimiento){
        if (ejbProcedimiento != null) {
            return ejbProcedimiento.find(id_procedimiento);
        }
        return new Procedimiento();
    }
    
    @Path("/{id_procedimiento}")
    @DELETE
    public Response remove(@PathParam("id_calendario") Integer id_procedimiento){
        Procedimiento a = new Procedimiento(id_procedimiento);
        Response respuesta = Response.status(Response.Status.NOT_FOUND).build();
        if (ejbProcedimiento != null) {
            ejbProcedimiento.remove(a);
            respuesta = Response.status(Response.Status.OK).build();
        }
        return respuesta;
    }
    @Path("/{id_procedimiento}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Procedimiento procedimiento){       
        ejbProcedimiento.create(procedimiento);
        return Response.status(Response.Status.CREATED).entity(procedimiento).build();
    }
}
