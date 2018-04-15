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
//import sv.edu.uesocc.ingenieria.mantenimientolib.Equipo;
//
///**
// *
// * @author ivan
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(EquipoRest.class)
//public class EquipoRestTest {
//    
//    private Equipo mockEquipo;
//    private EquipoRest mockEquipoRest;
//    
//    public EquipoRestTest() {
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
//        mockEquipoRest=Mockito.mock(EquipoRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class EquipoRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        Equipo equipo1=new Equipo();
//        equipo1.setIdEquipo(1);
//        equipo1.setDescripcion("equipo1");
//        
//        Equipo equipo2=new Equipo();
//        equipo2.setIdEquipo(2);
//        equipo2.setDescripcion("equipo2");
//
//        List<Equipo> expResult=new ArrayList<>();
//        expResult.add(equipo1);
//        expResult.add(equipo2);
//        
//        Mockito.when(mockEquipoRest.findAll()).thenReturn(expResult);
//        
//        List<Equipo> result=mockEquipoRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class EquipoRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockEquipoRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockEquipoRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class EquipoRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_equipo=1;
//        Equipo expResult=new Equipo();
//        expResult.setDescripcion("descripcion");
//        expResult.setIdEquipo(1);
//        
//        Mockito.when(mockEquipoRest.findById(id_equipo)).thenReturn(expResult);
//        
//        Equipo result=mockEquipoRest.findById(id_equipo);
//        
//        assertEquals(id_equipo, result.getIdEquipo());
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class EquipoRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_equipo=1;
//        
//        Equipo equipo=new Equipo(id_equipo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEquipoRest.remove(id_equipo)).thenReturn(expResult);
//        
//        Response result=mockEquipoRest.remove(id_equipo);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of create method, of class EquipoRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_equipo=1;
//        
//        Equipo equipo=new Equipo(id_equipo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEquipoRest.create(equipo)).thenReturn(expResult);
//        
//        Response result=mockEquipoRest.create(equipo);
//        
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of edit method, of class EquipoRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_equipo=1;
//        
//        Equipo equipo=new Equipo(id_equipo);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockEquipoRest.edit(id_equipo,equipo)).thenReturn(expResult);
//        
//        Response result=mockEquipoRest.edit(id_equipo,equipo);
//        
//        assertEquals(expResult, result);
//        
//        
//        
//        
//    }
//    
//}

