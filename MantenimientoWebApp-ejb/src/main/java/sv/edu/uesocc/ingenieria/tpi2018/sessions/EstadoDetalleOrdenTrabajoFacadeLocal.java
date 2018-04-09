/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.EstadoDetalleOrdenTrabajo;


/**
 *
 * @author ricky
 */
@Local
public interface EstadoDetalleOrdenTrabajoFacadeLocal {

    void create(EstadoDetalleOrdenTrabajo estadoDetalleOrdenTrabajo);

    void edit(EstadoDetalleOrdenTrabajo estadoDetalleOrdenTrabajo);

    void remove(EstadoDetalleOrdenTrabajo estadoDetalleOrdenTrabajo);

    EstadoDetalleOrdenTrabajo find(Object id);

    List<EstadoDetalleOrdenTrabajo> findAll();

    List<EstadoDetalleOrdenTrabajo> findRange(int[] range);

    int count();
    
}
