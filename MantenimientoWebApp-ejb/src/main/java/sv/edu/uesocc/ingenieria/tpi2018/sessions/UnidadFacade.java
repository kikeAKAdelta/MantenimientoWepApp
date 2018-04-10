/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import sv.edu.uesocc.ingenieria.mantenimientolib.Unidad;

/**
 *
 * @author ricky
 */
@Stateless
public class UnidadFacade extends AbstractFacade<Unidad> implements AbstractFacadeInterface<Unidad> {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria_MantenimientoWebApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadFacade() {
        super(Unidad.class);
    }
    
    public List<Unidad> findByName(String nameQuery,String value){
        TypedQuery<Unidad> filtroNames=em.createNamedQuery(nameQuery,Unidad.class).setParameter("nombreUnidad", value);
        List<Unidad> listaPartes=filtroNames.getResultList();
        return listaPartes;
    }
    
}
