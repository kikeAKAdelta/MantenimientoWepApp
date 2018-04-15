/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
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
//import sv.edu.uesocc.ingenieria.mantenimientolib.Responsable;
//
///**
// *
// * @author david
// */
//@RunWith(PowerMockRunner.class)
//public class ResponsableFacadeTest {
//    
//    @Rule
//    private EntityManagerProvider emp=new EntityManagerProvider();
//    
//    public ResponsableFacadeTest() {
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
//     * Test of create method, of class ResponsableFacade.
//     */
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Responsable expResult = new Responsable();
//        expResult.setIdResponsable(1);
//        expResult.setDocente(true);
//        
//        Responsable result = instance.create(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class UnidadFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Responsable expResult = new Responsable();
//        expResult.setIdResponsable(1);
//        expResult.setDocente(true);
//        
//        Responsable result = instance.edit(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of remove method, of class UnidadFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Responsable expResult = new Responsable();
//        expResult.setIdResponsable(1);
//        expResult.setDocente(true);
//        
//        Responsable result = instance.remove(entity);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of find method, of class UnidadFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        Responsable expResult = new Responsable();
//        expResult.setIdResponsable(1);
//        expResult.setDocente(true);
//        assertNotNull(entity.getIdResponsable());
//        instance.create(entity);
//        Responsable result = instance.find(1);
//        
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of crear method, of class UnidadFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//        System.out.println("crear");
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.crear(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals(true, entity.getDocente());
//        
//    }
//
//    /**
//     * Test of modificar method, of class UnidadFacade.
//     */
//    @Test
//    public void testModificar() throws Exception {
//        System.out.println("modificar");
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1); 
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.modificar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals(true, entity.getDocente());
//        
//    }
//
//    /**
//     * Test of eliminar method, of class UnidadFacade.
//     */
//    @Test
//    public void testEliminar() throws Exception {
//        System.out.println("eliminar");
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1); 
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        boolean expResult = true;
//        boolean result = instance.eliminar(entity);
//        
//        assertTrue(result);
//        assertEquals(expResult, result);
//        assertEquals(true, entity.getDocente());
//        
//    }
//
//    /**
//     * Test of findAll method, of class UnidadFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        List<Responsable> expResult=new ArrayList<>();
//        
//        expResult.add(entity);
//        
//        instance.create(entity);
//        
//        List<Responsable> result = instance.findAll();
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult.get(0), result.get(0));
//    }
//
//    /**
//     * Test of findRange method, of class UnidadFacade.
//     */
////    @Test
////    public void testFindRange() throws Exception {
////        System.out.println("findRange");
////        
////        Unidad entity = new Unidad();
////        entity.setIdUnidad(1);
////        entity.setNombreUnidad("postgrado");
////        
////        Unidad entity2 = new Unidad();
////        entity2.setIdUnidad(2);
////        entity2.setNombreUnidad("economia");
////        
////        assertNotNull(emp);
////        
////        EntityManager expected=emp.em();
////        assertNotNull(expected);
////        
////        UnidadFacade instance = new UnidadFacade();
////        
////        Whitebox.setInternalState(instance, "em", expected);
////        instance.getEntityManager().getTransaction().begin();
////        
////        List<Unidad> expResult = new ArrayList<>();
////        expResult.add(entity);
////        expResult.add(entity2);
////        
////        instance.create(entity);
////        instance.create(entity2);
////        
////        int[] range = {1,2};
////        
////        List<Unidad> result = instance.findRange(range);
////        
////        assertNotNull(expResult);
////        assertNotNull(result);
////        
////        assertEquals(expResult.get(0), result.get(0));
////    }
//
//    /**
//     * Test of count method, of class UnidadFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        
//        Responsable entity = new Responsable();
//        entity.setIdResponsable(1);
//        entity.setDocente(true);
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        ResponsableFacade instance = new ResponsableFacade();
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
