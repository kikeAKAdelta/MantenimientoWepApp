/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.DetalleMantenimiento;

/**
 *
 * @author david
 */
@Local
public interface DetalleMantenimientoFacadeLocal {

    void create(DetalleMantenimiento detalleMantenimiento);

    void edit(DetalleMantenimiento detalleMantenimiento);

    void remove(DetalleMantenimiento detalleMantenimiento);

    DetalleMantenimiento find(Object id);

    List<DetalleMantenimiento> findAll();

    List<DetalleMantenimiento> findRange(int[] range);

    int count();
    
}
