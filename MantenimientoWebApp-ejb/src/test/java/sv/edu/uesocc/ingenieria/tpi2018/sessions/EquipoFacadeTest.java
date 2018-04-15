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
//import org.powermock.modules.junit4.PowerMockRunner;
//import org.powermock.reflect.Whitebox;
//import sv.edu.uesocc.ingenieria.mantenimientolib.Equipo;
//
///**
// *
// * @author david
// */
//@RunWith(PowerMockRunner.class)
//public class EquipoFacadeTest {
//    
//    @Rule
//    private EntityManagerProvider emp=new EntityManagerProvider();
//    
//    public EquipoFacadeTest() {
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
//
//    /**
//     * Test of create method, of class EquipoFacade.
//     */
//    @Test
//    public void testCreate() throws Exception {
//       System.out.println("create");
//        
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Equipo expResult = new Equipo();
//        expResult.setIdEquipo(1);
//        expResult.setDescripcion("equipo");
//        
//        Equipo result = instance.create(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class EquipoFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Equipo expResult = new Equipo();
//        expResult.setIdEquipo(1);
//        expResult.setDescripcion("equipo");
//        
//        Equipo result = instance.edit(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of remove method, of class EquipoFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Equipo expResult = new Equipo();
//        expResult.setIdEquipo(1);
//        expResult.setDescripcion("equipo");
//        
//        Equipo result = instance.remove(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of find method, of class EquipoFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Equipo expResult = new Equipo();
//        expResult.setIdEquipo(1);
//        expResult.setDescripcion("equipo");
//        assertNotNull(entity.getIdEquipo());
//        instance.create(entity);
//        Equipo result = instance.find(1);
//        
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of crear method, of class EquipoFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//        System.out.println("crear");
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.crear(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("equipo", entity.getDescripcion());
//    }
//
//    /**
//     * Test of modificar method, of class EquipoFacade.
//     */
//    @Test
//    public void testModificar() throws Exception {
//        System.out.println("modificar");
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1); 
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.modificar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("equipo", entity.getDescripcion());
//    }
//
//    /**
//     * Test of eliminar method, of class EquipoFacade.
//     */
//    @Test
//    public void testEliminar() throws Exception {
//        System.out.println("eliminar");
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1); 
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.eliminar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals("equipo", entity.getDescripcion());
//    }
//
//    /**
//     * Test of findAll method, of class EquipoFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        List<Equipo> expResult=new ArrayList<>();
//        
//        expResult.add(entity);
//        
//        instance.create(entity);
//        
//        List<Equipo> result = instance.findAll();
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult.get(0), result.get(0));
//    }
//
//    /**
//     * Test of findRange method, of class EquipoFacade.
//     */
////    @Test
////    public void testFindRange() throws Exception {
////        System.out.println("findRange");
////        int[] range = null;
////        EquipoFacade instance = new EquipoFacade();
////        List<Equipo> expResult = null;
////        List<Equipo> result = instance.findRange(range);
////        assertEquals(expResult, result);
////         TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of count method, of class EquipoFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//       System.out.println("count");
//        
//        Equipo entity = new Equipo();
//        entity.setIdEquipo(1);
//        entity.setDescripcion("equipo");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        EquipoFacade instance = new EquipoFacade();
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
