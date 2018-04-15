/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento.TPI.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author degon
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(mantenimientoTPI.rest.AsuetoRest.class);
        resources.add(mantenimientoTPI.rest.CalendarioRest.class);
        resources.add(mantenimientoTPI.rest.CargoRest.class);
        resources.add(mantenimientoTPI.rest.DetalleEquipoRest.class);
        resources.add(mantenimientoTPI.rest.DiagnosticoParteRest.class);
        resources.add(mantenimientoTPI.rest.DiagnosticoRest.class);
        resources.add(mantenimientoTPI.rest.EquipoRest.class);
        resources.add(mantenimientoTPI.rest.EstadoDetalleMantenimientoRest.class);
        resources.add(mantenimientoTPI.rest.MarcaRest.class);
        resources.add(mantenimientoTPI.rest.ModeloRest.class);
        resources.add(mantenimientoTPI.rest.OrdenTrabajoRest.class);
        resources.add(mantenimientoTPI.rest.PasosRest.class);
        resources.add(mantenimientoTPI.rest.ProcedimientoRest.class);
        resources.add(mantenimientoTPI.rest.SolicitudRest.class);
        resources.add(mantenimientoTPI.rest.TipoMantenimientoRest.class);
        resources.add(mantenimientoTPI.rest.TrabajadoresRest.class);
    }
    
}
