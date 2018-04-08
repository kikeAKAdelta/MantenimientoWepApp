package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.modules.junit4.PowerMockRunner;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Tipomtto;

/**
 *
 * @author enrique
 */
@RunWith(PowerMockRunner.class)
public class TipomttoFacadeTest {
        
    @Rule
    private EntityManagerProvider emp=new EntityManagerProvider();
    
    public TipomttoFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class TipomttoFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Tipomtto entity = null;
        TipomttoFacade instance = new TipomttoFacade();
        Tipomtto expResult = null;
        Tipomtto result = instance.create(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class TipomttoFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Tipomtto entity = null;
        TipomttoFacade instance = new TipomttoFacade();
        Tipomtto expResult = null;
        Tipomtto result = instance.edit(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class TipomttoFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Tipomtto entity = null;
        TipomttoFacade instance = new TipomttoFacade();
        Tipomtto expResult = null;
        Tipomtto result = instance.remove(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class TipomttoFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        TipomttoFacade instance = new TipomttoFacade();
        Tipomtto expResult = null;
        Tipomtto result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class TipomttoFacade.
     */
    @Test
    public void testCrear() throws Exception {
        System.out.println("crear");
        Tipomtto entity = new Tipomtto();
        entity.setIdTipomtto(1);
        entity.setDescripcion("Este es un tipo de mantenimiento");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        EntityTransaction tx=emp.tx();
        assertNotNull(tx);
        
        TipomttoFacade instance = new TipomttoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.crear(entity);
        assertTrue(result);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of modificar method, of class TipomttoFacade.
     */
    @Test
    public void testModificar() throws Exception {
        System.out.println("modificar");
        Tipomtto entity = null;
        TipomttoFacade instance = new TipomttoFacade();
        boolean expResult = false;
        boolean result = instance.modificar(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TipomttoFacade.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Tipomtto entity = null;
        TipomttoFacade instance = new TipomttoFacade();
        boolean expResult = false;
        boolean result = instance.eliminar(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class TipomttoFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        TipomttoFacade instance = new TipomttoFacade();
        List<Tipomtto> expResult = null;
        List<Tipomtto> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class TipomttoFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        TipomttoFacade instance = new TipomttoFacade();
        List<Tipomtto> expResult = null;
        List<Tipomtto> result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class TipomttoFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        TipomttoFacade instance = new TipomttoFacade();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
