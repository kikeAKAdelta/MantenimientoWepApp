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
import sv.edu.uesocc.ingenieria.mantenimientolib.Unidad;

/**
 *
 * @author enrique
 */

@RunWith(PowerMockRunner.class)
public class UnidadFacadeTest {
    
    @Rule
    private EntityManagerProvider emp=new EntityManagerProvider();
    
    public UnidadFacadeTest() {
    }
    
    @BeforeClass
    public static void init() {
    }
    
    @AfterClass
    public static void tearDown() {
    }
    
    @Before
    public void forClass() {
    }
    
    @After
    public void cleanUp() {
    }

    /**
     * Test of create method, of class UnidadFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        Unidad expResult = new Unidad();
        expResult.setIdUnidad(1);
        expResult.setNombreUnidad("postgrado");
        
        Unidad result = instance.create(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class UnidadFacade.
     */
    @Test
    public void testEdit() throws Exception {
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        Unidad expResult = new Unidad();
        expResult.setIdUnidad(1);
        expResult.setNombreUnidad("postgrado");
        
        Unidad result = instance.edit(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class UnidadFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        Unidad expResult = new Unidad();
        expResult.setIdUnidad(1);
        expResult.setNombreUnidad("postgrado");
        
        Unidad result = instance.remove(entity);
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class UnidadFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        Unidad expResult = new Unidad();
        expResult.setIdUnidad(1);
        expResult.setNombreUnidad("postgrado");
        assertNotNull(entity.getIdUnidad());
        instance.create(entity);
        Unidad result = instance.find(1);
        
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of crear method, of class UnidadFacade.
     */
    @Test
    public void testCrear() throws Exception {
        System.out.println("crear");
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.crear(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
        assertEquals("postgrado", entity.getNombreUnidad());
        
    }

    /**
     * Test of modificar method, of class UnidadFacade.
     */
    @Test
    public void testModificar() throws Exception {
        System.out.println("modificar");
        Unidad entity = new Unidad();
        entity.setIdUnidad(1); 
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.modificar(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
        assertEquals("postgrado", entity.getNombreUnidad());
        
    }

    /**
     * Test of eliminar method, of class UnidadFacade.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Unidad entity = new Unidad();
        entity.setIdUnidad(1); 
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        boolean expResult = true;
        boolean result = instance.eliminar(entity);
        
        assertTrue(result);
        assertEquals(expResult, result);
        assertEquals("postgrado", entity.getNombreUnidad());
        
    }

    /**
     * Test of findAll method, of class UnidadFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        List<Unidad> expResult=new ArrayList<>();
        
        expResult.add(entity);
        
        instance.create(entity);
        
        List<Unidad> result = instance.findAll();
        
        assertNotNull(expResult);
        assertNotNull(result);
        
        assertEquals(expResult.get(0), result.get(0));
    }

    /**
     * Test of findRange method, of class UnidadFacade.
     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        
//        Unidad entity = new Unidad();
//        entity.setIdUnidad(1);
//        entity.setNombreUnidad("postgrado");
//        
//        Unidad entity2 = new Unidad();
//        entity2.setIdUnidad(2);
//        entity2.setNombreUnidad("economia");
//        
//        assertNotNull(emp);
//        
//        EntityManager expected=emp.em();
//        assertNotNull(expected);
//        
//        UnidadFacade instance = new UnidadFacade();
//        
//        Whitebox.setInternalState(instance, "em", expected);
//        instance.getEntityManager().getTransaction().begin();
//        
//        List<Unidad> expResult = new ArrayList<>();
//        expResult.add(entity);
//        expResult.add(entity2);
//        
//        instance.create(entity);
//        instance.create(entity2);
//        
//        int[] range = {1,2};
//        
//        List<Unidad> result = instance.findRange(range);
//        
//        assertNotNull(expResult);
//        assertNotNull(result);
//        
//        assertEquals(expResult.get(0), result.get(0));
//    }

    /**
     * Test of count method, of class UnidadFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        
        Unidad entity = new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        UnidadFacade instance = new UnidadFacade();
        
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        int expResult = 1;
        
        instance.create(entity);
        int result = instance.count();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of findByName method, of class UnidadFacade.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        
        Unidad entity=new Unidad();
        entity.setIdUnidad(1);
        entity.setNombreUnidad("postgrado");
        
        Unidad entity2=new Unidad();
        entity2.setIdUnidad(2);
        entity2.setNombreUnidad("postgrado");
        
        assertNotNull(emp);
        
        EntityManager expected=emp.em();
        assertNotNull(expected);
        
        String nameQuery = "Unidad.findByNombreUnidad";
        String value = "postgrado";
        
        UnidadFacade instance = new UnidadFacade();
        Whitebox.setInternalState(instance, "em", expected);
        instance.getEntityManager().getTransaction().begin();
        
        instance.create(entity2);
        instance.create(entity);
        
        List<Unidad> expResult = new ArrayList<>();
        expResult.add(entity2);
        expResult.add(entity);
        
        List<Unidad> result = instance.findByName(nameQuery, value);
        assertEquals(expResult.get(0).getNombreUnidad(), result.get(0).getNombreUnidad());
        assertEquals(expResult.get(1).getNombreUnidad(), result.get(1).getNombreUnidad());
        
    }
    
}
