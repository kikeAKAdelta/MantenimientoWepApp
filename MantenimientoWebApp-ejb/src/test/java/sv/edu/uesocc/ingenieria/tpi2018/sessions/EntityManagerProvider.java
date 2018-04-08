package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author enrique
 */
public class EntityManagerProvider  implements TestRule{
        
        protected static EntityManagerFactory emf;
        protected static EntityManager em;
        protected static EntityTransaction tx;

//        @BeforeClass
        public EntityManagerProvider(){
            emf=Persistence.createEntityManagerFactory("sv.edu.uesocc.ingenieria_MantenimientoWebApp-ejb_ejb_1.0-SNAPSHOTPU");
            em=emf.createEntityManager();
            tx=em.getTransaction();
        }
        
        @BeforeClass
        public static void init(){
            emf=Persistence.createEntityManagerFactory("sv.edu.uesocc.ingenieria_MantenimientoWebApp-ejb_ejb_1.0-SNAPSHOTPU");
            em=emf.createEntityManager();
            tx=em.getTransaction();
        }
        
        @After
        public void cleanUp(){
            em.getTransaction().rollback();
        }
        
        @AfterClass
        public static void tearDown(){
            em.clear();
            em.close();
            emf.close();
        }
        
        public EntityManager em(){
            return em;
        }
        
        public EntityTransaction tx() {
        return tx;
    }

    @Override
    public Statement apply(final Statement stmnt, Description d) {
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {
                stmnt.evaluate();
                em.clear();
            }

        };
    }
    
}
