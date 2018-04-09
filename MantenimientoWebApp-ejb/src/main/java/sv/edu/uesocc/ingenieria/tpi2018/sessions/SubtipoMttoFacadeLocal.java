/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.SubtipoMtto;

/**
 *
 * @author ricky
 */
@Local
public interface SubtipoMttoFacadeLocal {

    void create(SubtipoMtto subtipoMtto);

    void edit(SubtipoMtto subtipoMtto);

    void remove(SubtipoMtto subtipoMtto);

    SubtipoMtto find(Object id);

    List<SubtipoMtto> findAll();

    List<SubtipoMtto> findRange(int[] range);

    int count();
    
}
