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
//import sv.edu.uesocc.ingenieria.mantenimientolib.OrdenTrabajo;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(OrdenTrabajoRest.class)
//public class OrdenTrabajoRestTest {
//    
//    private OrdenTrabajo mockOrdenTrabajo;
//    private OrdenTrabajoRest mockOrdenTrabajoRest;
//    
//    public OrdenTrabajoRestTest() {
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
//        mockOrdenTrabajoRest=Mockito.mock(OrdenTrabajoRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        OrdenTrabajo ordenTrabajo1=new OrdenTrabajo();
//        ordenTrabajo1.setIdOrdenTrabajo(1);
//        ordenTrabajo1.setDescripcion("ordenTrabajo1");
//        
//        OrdenTrabajo ordenTrabajo2=new OrdenTrabajo();
//        ordenTrabajo2.setIdOrdenTrabajo(2);
//        ordenTrabajo2.setDescripcion("ordenTrabajo2");
//
//        List<OrdenTrabajo> expResult=new ArrayList<>();
//        expResult.add(ordenTrabajo1);
//        expResult.add(ordenTrabajo2);
//        
//        Mockito.when(mockOrdenTrabajoRest.findAll()).thenReturn(expResult);
//        
//        List<OrdenTrabajo> result=mockOrdenTrabajoRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockOrdenTrabajoRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockOrdenTrabajoRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_ordenTrabajo=1;
//        OrdenTrabajo expResult=new OrdenTrabajo();
//        expResult.setDescripcion("nombre");
//        expResult.setIdOrdenTrabajo(1);
//        
//        Mockito.when(mockOrdenTrabajoRest.findById(id_ordenTrabajo)).thenReturn(expResult);
//        
//        OrdenTrabajo result=mockOrdenTrabajoRest.findById(id_ordenTrabajo);
//        
//        assertEquals(id_ordenTrabajo, result.getIdOrdenTrabajo());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_ordenTrabajo=1;
//        
//        OrdenTrabajo ordenTrabajo=new OrdenTrabajo(id_ordenTrabajo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockOrdenTrabajoRest.remove(id_ordenTrabajo)).thenReturn(expResult);
//        
//        Response result=mockOrdenTrabajoRest.remove(id_ordenTrabajo);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_ordenTrabajo=1;
//        
//        OrdenTrabajo ordenTrabajo=new OrdenTrabajo(id_ordenTrabajo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockOrdenTrabajoRest.create(ordenTrabajo)).thenReturn(expResult);
//        
//        Response result=mockOrdenTrabajoRest.create(ordenTrabajo);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class OrdenTrabajoRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_ordenTrabajo=1;
//        
//        OrdenTrabajo ordenTrabajo=new OrdenTrabajo(id_ordenTrabajo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockOrdenTrabajoRest.edit(id_ordenTrabajo,ordenTrabajo)).thenReturn(expResult);
//        
//        Response result=mockOrdenTrabajoRest.edit(id_ordenTrabajo,ordenTrabajo);
//        
//        assertEquals(expResult, result);
//        
//        
//        
//        
//    }
//    
//}
