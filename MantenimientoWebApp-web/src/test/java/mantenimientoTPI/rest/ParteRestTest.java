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
//import sv.edu.uesocc.ingenieria.mantenimientolib.Parte;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(ParteRest.class)
//public class ParteRestTest {
//    
//    private Parte mockParte;
//    private ParteRest mockParteRest;
//    
//    public ParteRestTest() {
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
//        mockParteRest=Mockito.mock(ParteRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class ParteRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        Parte parte1=new Parte();
//        parte1.setIdParte(1);
//        parte1.setDescripcion("parte1");
//        
//        Parte parte2=new Parte();
//        parte2.setIdParte(2);
//        parte2.setDescripcion("parte2");
//
//        List<Parte> expResult=new ArrayList<>();
//        expResult.add(parte1);
//        expResult.add(parte2);
//        
//        Mockito.when(mockParteRest.findAll()).thenReturn(expResult);
//        
//        List<Parte> result=mockParteRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class ParteRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockParteRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockParteRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class ParteRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_parte=1;
//        Parte expResult=new Parte();
//        expResult.setDescripcion("nombre");
//        expResult.setIdParte(1);
//        
//        Mockito.when(mockParteRest.findById(id_parte)).thenReturn(expResult);
//        
//        Parte result=mockParteRest.findById(id_parte);
//        
//        assertEquals(id_parte, result.getIdParte());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class ParteRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_parte=1;
//        
//        Parte parte=new Parte(id_parte);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockParteRest.remove(id_parte)).thenReturn(expResult);
//        
//        Response result=mockParteRest.remove(id_parte);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class ParteRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_parte=1;
//        
//        Parte parte=new Parte(id_parte);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockParteRest.create(parte)).thenReturn(expResult);
//        
//        Response result=mockParteRest.create(parte);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class ParteRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_parte=1;
//        
//        Parte parte=new Parte(id_parte);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockParteRest.edit(id_parte,parte)).thenReturn(expResult);
//        
//        Response result=mockParteRest.edit(id_parte,parte);
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
