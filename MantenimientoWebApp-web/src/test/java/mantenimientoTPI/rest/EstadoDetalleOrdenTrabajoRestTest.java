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
//import sv.edu.uesocc.ingenieria.mantenimientolib.EstadoDetalleOrdenTrabajo;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(EstadoDetalleOrdenTrabajoRest.class)
//public class EstadoDetalleOrdenTrabajoRestTest {
//    
//    private EstadoDetalleOrdenTrabajo mockEstadoDetalleOrdenTrabajo;
//    private EstadoDetalleOrdenTrabajoRest mockEstadoDetalleOrdenTrabajoRest;
//    
//    public EstadoDetalleOrdenTrabajoRestTest() {
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
//        mockEstadoDetalleOrdenTrabajoRest=Mockito.mock(EstadoDetalleOrdenTrabajoRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        EstadoDetalleOrdenTrabajo unidad1=new EstadoDetalleOrdenTrabajo();
//        unidad1.setDetalleOrdenTrabajo(1);
//        
//        EstadoDetalleOrdenTrabajo unidad2=new EstadoDetalleOrdenTrabajo();
//        unidad2.setDetalleOrdenTrabajo(2);
//
//        List<EstadoDetalleOrdenTrabajo> expResult=new ArrayList<>();
//        expResult.add(unidad1);
//        expResult.add(unidad2);
//        
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.findAll()).thenReturn(expResult);
//        
//        List<EstadoDetalleOrdenTrabajo> result=mockEstadoDetalleOrdenTrabajoRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockEstadoDetalleOrdenTrabajoRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_unidad=1;
//        EstadoDetalleOrdenTrabajo expResult=new EstadoDetalleOrdenTrabajo();
//        expResult.setDetalleOrdenTrabajo(1);
//        
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.findById(id_unidad)).thenReturn(expResult);
//        
//        EstadoDetalleOrdenTrabajo result=mockEstadoDetalleOrdenTrabajoRest.findById(id_unidad);
//        
//        assertEquals(id_unidad, result.getDetalleOrdenTrabajo());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_unidad=1;
//        
//        EstadoDetalleOrdenTrabajo unidad=new EstadoDetalleOrdenTrabajo(id_unidad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.remove(id_unidad)).thenReturn(expResult);
//        
//        Response result=mockEstadoDetalleOrdenTrabajoRest.remove(id_unidad);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_unidad=1;
//        
//        EstadoDetalleOrdenTrabajo unidad=new EstadoDetalleOrdenTrabajo(id_unidad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.create(unidad)).thenReturn(expResult);
//        
//        Response result=mockEstadoDetalleOrdenTrabajoRest.create(unidad);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class EstadoDetalleOrdenTrabajoRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_unidad=1;
//        
//        EstadoDetalleOrdenTrabajo unidad=new EstadoDetalleOrdenTrabajo(id_unidad);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEstadoDetalleOrdenTrabajoRest.edit(id_unidad,unidad)).thenReturn(expResult);
//        
//        Response result=mockEstadoDetalleOrdenTrabajoRest.edit(id_unidad,unidad);
//        
//        assertEquals(expResult, result);
//        
//        
//        
//        
//    }
//    
//}
//
