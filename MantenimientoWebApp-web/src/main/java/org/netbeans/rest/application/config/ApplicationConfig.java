/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ricky
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
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.CalendarioREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.DetalleOrdenTrabajoREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.DiagnosticoParteREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.DiagnosticoREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.EquipoREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.EstadoDetalleOrdenTrabajoREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.EstadoREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.ExcepcionCalendarioREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.MttoDetalleREST.class);
        resources.add(sv.edu.uesocc.ingenieria.tpi2018.services.OrdenTrabajoREST.class);
    }
    
}
