/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.mantenimientolib.ExcepcionCalendario;


/**
 *
 * @author ricky
 */
@Local
public interface ExcepcionCalendarioFacadeLocal {

    void create(ExcepcionCalendario excepcionCalendario);

    void edit(ExcepcionCalendario excepcionCalendario);

    void remove(ExcepcionCalendario excepcionCalendario);

    ExcepcionCalendario find(Object id);

    List<ExcepcionCalendario> findAll();

    List<ExcepcionCalendario> findRange(int[] range);

    int count();
    
}
