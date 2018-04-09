/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Tipomtto;

/**
 *
 * @author ricky
 */
@Local
public interface TipomttoFacadeLocal {

    void create(Tipomtto tipomtto);

    void edit(Tipomtto tipomtto);

    void remove(Tipomtto tipomtto);

    Tipomtto find(Object id);

    List<Tipomtto> findAll();

    List<Tipomtto> findRange(int[] range);

    int count();
    
}
