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
//import sv.edu.uesocc.ingenieria.mantenimientolib.ExcepcionCalendario;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(ExcepcionCalendarioRest.class)
//public class ExcepcionCalendarioRestTest {
//    
//    private ExcepcionCalendario mockExcepcionCalendario;
//    private ExcepcionCalendarioRest mockExcepcionCalendarioRest;
//    
//    public ExcepcionCalendarioRestTest() {
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
//        mockExcepcionCalendarioRest=Mockito.mock(ExcepcionCalendarioRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        ExcepcionCalendario excepcionalCalendario1=new ExcepcionCalendario();
//        excepcionalCalendario1.setIdExcepcion(1);
//        
//        ExcepcionCalendario excepcionalCalendario2=new ExcepcionCalendario();
//        excepcionalCalendario2.setIdExcepcion(2);
//
//        List<ExcepcionCalendario> expResult=new ArrayList<>();
//        expResult.add(excepcionalCalendario1);
//        expResult.add(excepcionalCalendario2);
//        
//        Mockito.when(mockExcepcionCalendarioRest.findAll()).thenReturn(expResult);
//        
//        List<ExcepcionCalendario> result=mockExcepcionCalendarioRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockExcepcionCalendarioRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockExcepcionCalendarioRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_excepcionalCalendario=1;
//        ExcepcionCalendario expResult=new ExcepcionCalendario();
//        expResult.setIdExcepcion(1);
//        
//        Mockito.when(mockExcepcionCalendarioRest.findById(id_excepcionalCalendario)).thenReturn(expResult);
//        
//        ExcepcionCalendario result=mockExcepcionCalendarioRest.findById(id_excepcionalCalendario);
//        
//        assertEquals(id_excepcionalCalendario, result.getIdExcepcion());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_excepcionalCalendario=1;
//        
//        ExcepcionCalendario excepcionalCalendario=new ExcepcionCalendario(id_excepcionalCalendario);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockExcepcionCalendarioRest.remove(id_excepcionalCalendario)).thenReturn(expResult);
//        
//        Response result=mockExcepcionCalendarioRest.remove(id_excepcionalCalendario);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_excepcionalCalendario=1;
//        
//        ExcepcionCalendario excepcionalCalendario=new ExcepcionCalendario(id_excepcionalCalendario);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockExcepcionCalendarioRest.create(excepcionalCalendario)).thenReturn(expResult);
//        
//        Response result=mockExcepcionCalendarioRest.create(excepcionalCalendario);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class ExcepcionCalendarioRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_excepcionalCalendario=1;
//        
//        ExcepcionCalendario excepcionalCalendario=new ExcepcionCalendario(id_excepcionalCalendario);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockExcepcionCalendarioRest.edit(id_excepcionalCalendario,excepcionalCalendario)).thenReturn(expResult);
//        
//        Response result=mockExcepcionCalendarioRest.edit(id_excepcionalCalendario,excepcionalCalendario);
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
