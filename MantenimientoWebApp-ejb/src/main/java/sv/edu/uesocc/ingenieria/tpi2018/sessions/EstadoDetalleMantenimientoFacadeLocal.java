/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.EstadoDetalleMantenimiento;

/**
 *
 * @author david
 */
@Local
public interface EstadoDetalleMantenimientoFacadeLocal {

    void create(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    void edit(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    void remove(EstadoDetalleMantenimiento estadoDetalleMantenimiento);

    EstadoDetalleMantenimiento find(Object id);

    List<EstadoDetalleMantenimiento> findAll();

    List<EstadoDetalleMantenimiento> findRange(int[] range);

    int count();
    
}
