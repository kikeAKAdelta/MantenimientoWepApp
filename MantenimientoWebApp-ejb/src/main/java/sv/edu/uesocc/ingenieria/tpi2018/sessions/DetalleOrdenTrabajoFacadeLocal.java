/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;

/**
 *
 * @author ricky
 */
@Local
public interface DetalleOrdenTrabajoFacadeLocal {

    void create(DetalleOrdenTrabajo detalleOrdenTrabajo);

    void edit(DetalleOrdenTrabajo detalleOrdenTrabajo);

    void remove(DetalleOrdenTrabajo detalleOrdenTrabajo);

    DetalleOrdenTrabajo find(Object id);

    List<DetalleOrdenTrabajo> findAll();

    List<DetalleOrdenTrabajo> findRange(int[] range);

    int count();
    
}
