package mantenimientoTPI.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DetalleOrdenTrabajoRest.class)
public class DetalleOrdenTrabajoRestTest {
    
    private DetalleOrdenTrabajo mockDetalleOrdenTrabajo;
    private DetalleOrdenTrabajoRest mockDetalleOrdenTrabajoRest;
    
    public DetalleOrdenTrabajoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockDetalleOrdenTrabajoRest=Mockito.mock(DetalleOrdenTrabajoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testFindAll() {

        DetalleOrdenTrabajo detalleOT1=new DetalleOrdenTrabajo();
        detalleOT1.setIdDetalleOrdenTrabajo(1);
        
        DetalleOrdenTrabajo detalleOT2=new DetalleOrdenTrabajo();
        detalleOT2.setIdDetalleOrdenTrabajo(2);

        List<DetalleOrdenTrabajo> expResult=new ArrayList<>();
        expResult.add(detalleOT1);
        expResult.add(detalleOT2);
        
        Mockito.when(mockDetalleOrdenTrabajoRest.findAll()).thenReturn(expResult);
        
        List<DetalleOrdenTrabajo> result=mockDetalleOrdenTrabajoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockDetalleOrdenTrabajoRest.count()).thenReturn(expInteger);
        
        Integer result=mockDetalleOrdenTrabajoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_detalleOT=1;
        DetalleOrdenTrabajo expResult=new DetalleOrdenTrabajo();
        expResult.setIdDetalleOrdenTrabajo(1);
        
        Mockito.when(mockDetalleOrdenTrabajoRest.findById(id_detalleOT)).thenReturn(expResult);
        
        DetalleOrdenTrabajo result=mockDetalleOrdenTrabajoRest.findById(id_detalleOT);
        
        assertEquals(id_detalleOT, result.getIdDetalleOrdenTrabajo());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_detalleOT=1;
        
        DetalleOrdenTrabajo detalleOT=new DetalleOrdenTrabajo(id_detalleOT);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDetalleOrdenTrabajoRest.remove(id_detalleOT)).thenReturn(expResult);
        
        Response result=mockDetalleOrdenTrabajoRest.remove(id_detalleOT);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_detalleOT=1;
        
        DetalleOrdenTrabajo detalleOT=new DetalleOrdenTrabajo(id_detalleOT);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDetalleOrdenTrabajoRest.create(detalleOT)).thenReturn(expResult);
        
        Response result=mockDetalleOrdenTrabajoRest.create(detalleOT);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class DetalleOrdenTrabajoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_detalleOT=1;
        
        DetalleOrdenTrabajo detalleOT=new DetalleOrdenTrabajo(id_detalleOT);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDetalleOrdenTrabajoRest.edit(id_detalleOT,detalleOT)).thenReturn(expResult);
        
        Response result=mockDetalleOrdenTrabajoRest.edit(id_detalleOT,detalleOT);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}
