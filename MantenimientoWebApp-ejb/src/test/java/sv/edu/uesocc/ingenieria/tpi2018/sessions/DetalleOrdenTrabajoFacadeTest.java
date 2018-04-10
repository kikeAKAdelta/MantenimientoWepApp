/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi2018.sessions;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.modules.junit4.PowerMockRunner;
import sv.edu.uesocc.ingenieria.mantenimientolib.DetalleOrdenTrabajo;

/**
 *
 * @author david
 */
@RunWith(PowerMockRunner.class)
public class DetalleOrdenTrabajoFacadeTest {
    
    @Rule
    private EntityManagerProvider emp=new EntityManagerProvider();
    
    public DetalleOrdenTrabajoFacadeTest() {
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
     * Test of create method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        DetalleOrdenTrabajo expResult = new DetalleOrdenTrabajo();
        expResult.setIdDetalleOrdenTrabajo(1);
        
        DetalleOrdenTrabajo result = instance.create(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
         DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        DetalleOrdenTrabajo expResult = new DetalleOrdenTrabajo();
        expResult.setIdDetalleOrdenTrabajo(1);
        
        DetalleOrdenTrabajo result = instance.edit(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }
    /**
     * Test of remove method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        DetalleOrdenTrabajo expResult = new DetalleOrdenTrabajo();
        expResult.setIdDetalleOrdenTrabajo(1);
        
        DetalleOrdenTrabajo result = instance.remove(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        DetalleOrdenTrabajo expResult = new DetalleOrdenTrabajo();
        expResult.setIdDetalleOrdenTrabajo(1);
        assertNotNull(entity.getIdDetalleOrdenTrabajo());
        instance.create(entity);
        DetalleOrdenTrabajo result = instance.find(1);
        
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of crear method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testCrear() throws Exception {
        System.out.println("crear");
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.crear(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of modificar method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testModificar() throws Exception {
        System.out.println("modificar");
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1); 
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.modificar(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testEliminar() throws Exception {
       System.out.println("eliminar");
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1); 
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.eliminar(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        List<DetalleOrdenTrabajo> expResult=new ArrayList<>();
        
        expResult.add(entity);
        
        instance.create(entity);
        
        List<DetalleOrdenTrabajo> result = instance.findAll();
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult.get(0), result.get(0));
    }

    /**
     * Test of findRange method, of class DetalleOrdenTrabajoFacade.
     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int[] range = null;
//        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
//        List<DetalleOrdenTrabajo> expResult = null;
//        List<DetalleOrdenTrabajo> result = instance.findRange(range);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of count method, of class DetalleOrdenTrabajoFacade.
     */
    @Test
    public void testCount() throws Exception {
      System.out.println("count");
        
        DetalleOrdenTrabajo entity = new DetalleOrdenTrabajo();
        entity.setIdDetalleOrdenTrabajo(1);
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        DetalleOrdenTrabajoFacade instance = new DetalleOrdenTrabajoFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        int expResult = 1;
        
        instance.create(entity);
        int result = instance.count();
        
        assertEquals(expResult, result);
    }
    
}
