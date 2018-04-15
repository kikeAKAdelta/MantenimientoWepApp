/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package sv.edu.uesocc.ingenieria.tpi2018.sessions;
//
//import java.util.ArrayList;
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
//import sv.edu.uesocc.ingenieria.mantenimientolib.Diagnostico;

/**
 *
 * @author david
 */
//@RunWith(PowerMockRunner.class)
//public class DiagnosticoFacadeTest {
//    
//    @Rule
//    private EntityManagerProvider emp=new EntityManagerProvider();
//    
//    public DiagnosticoFacadeTest() {
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
     * Test of create method, of class DiagnosticoFacade.
     */
//    @Test
//    public void testCreate() throws Exception {
//       System.out.println("create");
//        
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Diagnostico expResult = new Diagnostico();
//        expResult.setIdDiagnostico(1);
//        expResult.setDescripcion("Diagnostico");
//        
//        Diagnostico result = instance.create(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Diagnostico expResult = new Diagnostico();
//        expResult.setIdDiagnostico(1);
//        expResult.setDescripcion("Diagnostico");
//        
//        Diagnostico result = instance.edit(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of remove method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Diagnostico expResult = new Diagnostico();
//        expResult.setIdDiagnostico(1);
//        expResult.setDescripcion("Diagnostico");
//        
//        Diagnostico result = instance.remove(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of find method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Diagnostico expResult = new Diagnostico();
//        expResult.setIdDiagnostico(1);
//        expResult.setDescripcion("Diagnostico");
//        assertNotNull(entity.getDescripcion());
//        instance.create(entity);
//        Diagnostico result = instance.find(1);
//        
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of crear method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//       System.out.println("crear");
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.crear(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Diagnostico", entity.getDescripcion());
//        
//    }
//
//    /**
//     * Test of modificar method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testModificar() throws Exception {
//        System.out.println("modificar");
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1); 
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.modificar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Diagnostico", entity.getDescripcion());
//    }
//
//    /**
//     * Test of eliminar method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testEliminar() throws Exception {
//        System.out.println("eliminar");
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1); 
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.eliminar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("Diagnostico", entity.getDescripcion());
//    }
//
//    /**
//     * Test of findAll method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        List<Diagnostico> expResult=new ArrayList<>();
//        
//        expResult.add(entity);
//        
//        instance.create(entity);
//        
//        List<Diagnostico> result = instance.findAll();
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult.get(0), result.get(0));
//    }
//
//    /**
//     * Test of findRange method, of class DiagnosticoFacade.
//     */
////    @Test
////    public void testFindRange() throws Exception {
////        System.out.println("findRange");
////        int[] range = null;
////        DiagnosticoFacade instance = new DiagnosticoFacade();
////        List<Diagnostico> expResult = null;
////        List<Diagnostico> result = instance.findRange(range);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of count method, of class DiagnosticoFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//       System.out.println("count");
//        
//        Diagnostico entity = new Diagnostico();
//        entity.setIdDiagnostico(1);
//        entity.setDescripcion("Diagnostico");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        DiagnosticoFacade instance = new DiagnosticoFacade();
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
