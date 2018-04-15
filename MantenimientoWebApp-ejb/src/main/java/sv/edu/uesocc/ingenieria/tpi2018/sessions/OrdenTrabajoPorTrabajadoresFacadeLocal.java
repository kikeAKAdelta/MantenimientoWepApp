/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.OrdenTrabajoPorTrabajadores;

/**
 *
 * @author david
 */
@Local
public interface OrdenTrabajoPorTrabajadoresFacadeLocal {

    void create(OrdenTrabajoPorTrabajadores ordenTrabajoPorTrabajadores);

    void edit(OrdenTrabajoPorTrabajadores ordenTrabajoPorTrabajadores);

    void remove(OrdenTrabajoPorTrabajadores ordenTrabajoPorTrabajadores);

    OrdenTrabajoPorTrabajadores find(Object id);

    List<OrdenTrabajoPorTrabajadores> findAll();

    List<OrdenTrabajoPorTrabajadores> findRange(int[] range);

    int count();
    
}
