/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.mantenimientolib.SubtipoMtto;

/**
 *
 * @author ricky
 */
@Stateless
public class SubtipoMttoFacade extends AbstractFacade<SubtipoMtto> implements AbstractFacadeInterface<SubtipoMtto> {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubtipoMttoFacade() {
        super(SubtipoMtto.class);
    }
    
}
