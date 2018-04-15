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
//import sv.edu.uesocc.ingenieria.mantenimientolib.Procedimiento;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(ProcedimientoRest.class)
//public class ProcedimientoRestTest {
//    
//    private Procedimiento mockProcedimiento;
//    private ProcedimientoRest mockProcedimientoRest;
//    
//    public ProcedimientoRestTest() {
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
//        mockProcedimientoRest=Mockito.mock(ProcedimientoRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        Procedimiento procedimiento1=new Procedimiento();
//        procedimiento1.setIdProcedimiento(1);
//        procedimiento1.setDescripcion("procedimiento1");
//        
//        Procedimiento procedimiento2=new Procedimiento();
//        procedimiento2.setIdProcedimiento(2);
//        procedimiento2.setDescripcion("procedimiento2");
//
//        List<Procedimiento> expResult=new ArrayList<>();
//        expResult.add(procedimiento1);
//        expResult.add(procedimiento2);
//        
//        Mockito.when(mockProcedimientoRest.findAll()).thenReturn(expResult);
//        
//        List<Procedimiento> result=mockProcedimientoRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockProcedimientoRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockProcedimientoRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_procedimiento=1;
//        Procedimiento expResult=new Procedimiento();
//        expResult.setDescripcion("nombre");
//        expResult.setIdProcedimiento(1);
//        
//        Mockito.when(mockProcedimientoRest.findById(id_procedimiento)).thenReturn(expResult);
//        
//        Procedimiento result=mockProcedimientoRest.findById(id_procedimiento);
//        
//        assertEquals(id_procedimiento, result.getIdProcedimiento());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_procedimiento=1;
//        
//        Procedimiento procedimiento=new Procedimiento(id_procedimiento);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockProcedimientoRest.remove(id_procedimiento)).thenReturn(expResult);
//        
//        Response result=mockProcedimientoRest.remove(id_procedimiento);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_procedimiento=1;
//        
//        Procedimiento procedimiento=new Procedimiento(id_procedimiento);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockProcedimientoRest.create(procedimiento)).thenReturn(expResult);
//        
//        Response result=mockProcedimientoRest.create(procedimiento);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class ProcedimientoRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_procedimiento=1;
//        
//        Procedimiento procedimiento=new Procedimiento(id_procedimiento);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockProcedimientoRest.edit(id_procedimiento,procedimiento)).thenReturn(expResult);
//        
//        Response result=mockProcedimientoRest.edit(id_procedimiento,procedimiento);
//        
//        assertEquals(expResult, result);
//        
//        
//        
//        
//    }
//    
//}
