
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;

/**
 *
 * @author enrique
 */
public interface AbstractFacadeInterface<T> {
    
    T create(T entity);

    T edit(T entity);

    T remove(T entity);
    
    T find(Object id);

    boolean crear (T entity);
    
    boolean modificar (T entity);
    
    boolean eliminar (T entity);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
    
}
