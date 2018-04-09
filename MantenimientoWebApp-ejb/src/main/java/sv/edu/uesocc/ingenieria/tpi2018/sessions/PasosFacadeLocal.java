/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.Pasos;


/**
 *
 * @author ricky
 */
@Local
public interface PasosFacadeLocal {

    void create(Pasos pasos);

    void edit(Pasos pasos);

    void remove(Pasos pasos);

    Pasos find(Object id);

    List<Pasos> findAll();

    List<Pasos> findRange(int[] range);

    int count();
    
}
