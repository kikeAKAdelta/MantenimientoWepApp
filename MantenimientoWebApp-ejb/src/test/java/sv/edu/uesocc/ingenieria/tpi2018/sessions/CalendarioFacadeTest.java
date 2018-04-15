/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package sv.edu.uesocc.ingenieria.tpi2018.sessions;
//
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//import javax.persistence.EntityManager;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.Rule;
//import org.junit.runner.RunWith;
//import org.mockito.internal.util.reflection.Whitebox;
//import org.powermock.modules.junit4.PowerMockRunner;
//import sv.edu.uesocc.ingenieria.mantenimientolib.Calendario;


/**
 *
 * @author david
 */
//@RunWith(PowerMockRunner.class)
//public class CalendarioFacadeTest {
//    
//    @Rule
//    private EntityManagerProvider emp=new EntityManagerProvider();
//    
//    public CalendarioFacadeTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of create method, of class CalendarioFacade.
     */
//    @Test
//    public void testCreate() throws Exception {
//       System.out.println("create");
//        
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento al Departamento de Ingenieria y Arquitectura");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Calendario expResult = new Calendario();
//        expResult.setIdCalendario(1);
//        expResult.setDescripcion("Mantenimiento al Departamento de Ingenieria y Arquitectura");
//        
//        Calendario result = instance.create(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class CalendarioFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        
//        Calendario entity = new Calendario();
//        
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Calendario expResult = new Calendario();
//        expResult.setIdCalendario(1);
//        expResult.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        
//        Calendario result = instance.edit(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of remove method, of class CalendarioFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Calendario expResult = new Calendario();
//        expResult.setIdCalendario(1);
//        expResult.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        
//        Calendario result = instance.remove(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of find method, of class CalendarioFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Calendario expResult = new Calendario();
//        expResult.setIdCalendario(1);
//        expResult.setDescripcion("Mantenimiento al departamento de Ingenieria");
//        assertNotNull(entity.getIdCalendario());
//        instance.create(entity);
//        Calendario result = instance.find(1);
//        
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of crear method, of class CalendarioFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//       System.out.println("crear");
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento en el departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.crear(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Mantenimiento en el departamento de Ingenieria", entity.getDescripcion());
//    }
//
//    /**
//     * Test of modificar method, of class CalendarioFacade.
//     */
//    @Test
//    public void testModificar() throws Exception {
//         System.out.println("modificar");
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1); 
//        entity.setDescripcion("Mantenimiento en el departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.modificar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Mantenimiento en el departamento de Ingenieria", entity.getDescripcion());
//    }
//
//    /**
//     * Test of eliminar method, of class CalendarioFacade.
//     */
//    @Test
//    public void testEliminar() throws Exception {
//        System.out.println("eliminar");
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1); 
//        entity.setDescripcion("Mantenimiento del departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.eliminar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Mantenimiento del departamento de Ingenieria", entity.getDescripcion());
//    }
//
//    /**
//     * Test of findAll method, of class CalendarioFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento en el departamento de Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        List<Calendario> expResult=new ArrayList<>();
//        
//        expResult.add(entity);
//        
//        instance.create(entity);
//        
//        List<Calendario> result = instance.findAll();
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult.get(0), result.get(0));
//    }
//
//    /**
//     * Test of findRange method, of class CalendarioFacade.
//     */
////    @Test
////    public void testFindRange() throws Exception {
////        System.out.println("findRange");
////        int[] range = null;
////        CalendarioFacade instance = new CalendarioFacade();
////        List<Calendario> expResult = null;
////        List<Calendario> result = instance.findRange(range);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of count method, of class CalendarioFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        
//        Calendario entity = new Calendario();
//        entity.setIdCalendario(1);
//        entity.setDescripcion("Mantenimiento a Ingenieria");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        CalendarioFacade instance = new CalendarioFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        int expResult = 1;
//        
//        instance.create(entity);
//        int result = instance.count();
//        
//        assertEquals(expResult, result);
//    }
//    
//}
