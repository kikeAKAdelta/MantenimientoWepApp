/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.MttoDetalle;


/**
 *
 * @author ricky
 */
@Local
public interface MttoDetalleFacadeLocal {

    void create(MttoDetalle mttoDetalle);

    void edit(MttoDetalle mttoDetalle);

    void remove(MttoDetalle mttoDetalle);

    MttoDetalle find(Object id);

    List<MttoDetalle> findAll();

    List<MttoDetalle> findRange(int[] range);

    int count();
    
}
