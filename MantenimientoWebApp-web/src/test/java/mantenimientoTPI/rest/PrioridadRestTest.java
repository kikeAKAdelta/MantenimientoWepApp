//package mantenimientoTPI.rest;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.ws.rs.core.Response;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//import sv.edu.uesocc.ingenieria.mantenimientolib.Prioridad;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(PrioridadRest.class)
//public class PrioridadRestTest {
//    
//    private Prioridad mockPrioridad;
//    private PrioridadRest mockPrioridadRest;
//    
//    public PrioridadRestTest() {
//       
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
//        
//        mockPrioridadRest=Mockito.mock(PrioridadRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class PrioridadRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        Prioridad prioridad1=new Prioridad();
//        prioridad1.setIdPrioridad(1);
//        prioridad1.setDescripcion("prioridad1");
//        
//        Prioridad prioridad2=new Prioridad();
//        prioridad2.setIdPrioridad(2);
//        prioridad2.setDescripcion("prioridad2");
//
//        List<Prioridad> expResult=new ArrayList<>();
//        expResult.add(prioridad1);
//        expResult.add(prioridad2);
//        
//        Mockito.when(mockPrioridadRest.findAll()).thenReturn(expResult);
//        
//        List<Prioridad> result=mockPrioridadRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class PrioridadRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockPrioridadRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockPrioridadRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class PrioridadRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_prioridad=1;
//        Prioridad expResult=new Prioridad();
//        expResult.setDescripcion("nombre");
//        expResult.setIdPrioridad(1);
//        
//        Mockito.when(mockPrioridadRest.findById(id_prioridad)).thenReturn(expResult);
//        
//        Prioridad result=mockPrioridadRest.findById(id_prioridad);
//        
//        assertEquals(id_prioridad, result.getIdPrioridad());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class PrioridadRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_prioridad=1;
//        
//        Prioridad prioridad=new Prioridad(id_prioridad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockPrioridadRest.remove(id_prioridad)).thenReturn(expResult);
//        
//        Response result=mockPrioridadRest.remove(id_prioridad);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class PrioridadRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_prioridad=1;
//        
//        Prioridad prioridad=new Prioridad(id_prioridad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockPrioridadRest.create(prioridad)).thenReturn(expResult);
//        
//        Response result=mockPrioridadRest.create(prioridad);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class PrioridadRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_prioridad=1;
//        
//        Prioridad prioridad=new Prioridad(id_prioridad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockPrioridadRest.edit(id_prioridad,prioridad)).thenReturn(expResult);
//        
//        Response result=mockPrioridadRest.edit(id_prioridad,prioridad);
//        
//        assertEquals(expResult, result);
//        
//        
//        
//        
//    }
//    
//}
