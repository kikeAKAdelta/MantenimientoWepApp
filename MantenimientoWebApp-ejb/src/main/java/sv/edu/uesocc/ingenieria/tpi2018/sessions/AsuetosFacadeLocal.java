/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.Asuetos;

/**
 *
 * @author david
 */
@Local
public interface AsuetosFacadeLocal {

    void create(Asuetos asuetos);

    void edit(Asuetos asuetos);

    void remove(Asuetos asuetos);

    Asuetos find(Object id);

    List<Asuetos> findAll();

    List<Asuetos> findRange(int[] range);

    int count();
    
}
