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
import sv.edu.uesocc.ingenieria.mantenimientolib.Solicitud;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SolicitudRest.class)
public class SolicitudRestTest {
    
    private Solicitud mockSolicitud;
    private SolicitudRest mockSolicitudRest;
    
    public SolicitudRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockSolicitudRest=Mockito.mock(SolicitudRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class SolicitudRest.
     */
    @Test
    public void testFindAll() {

        Solicitud solicitud1=new Solicitud();
        solicitud1.setIdSolicitud(1);
        solicitud1.setSolicitante("solicitud1");
        
        Solicitud solicitud2=new Solicitud();
        solicitud2.setIdSolicitud(2);
        solicitud2.setSolicitante("solicitud2");

        List<Solicitud> expResult=new ArrayList<>();
        expResult.add(solicitud1);
        expResult.add(solicitud2);
        
        Mockito.when(mockSolicitudRest.findAll()).thenReturn(expResult);
        
        List<Solicitud> result=mockSolicitudRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class SolicitudRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockSolicitudRest.count()).thenReturn(expInteger);
        
        Integer result=mockSolicitudRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class SolicitudRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_solicitud=1;
        Solicitud expResult=new Solicitud();
        expResult.setSolicitante("nombre");
        expResult.setIdSolicitud(1);
        
        Mockito.when(mockSolicitudRest.findById(id_solicitud)).thenReturn(expResult);
        
        Solicitud result=mockSolicitudRest.findById(id_solicitud);
        
        assertEquals(id_solicitud, result.getIdSolicitud());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class SolicitudRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_solicitud=1;
        
        Solicitud solicitud=new Solicitud(id_solicitud);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSolicitudRest.remove(id_solicitud)).thenReturn(expResult);
        
        Response result=mockSolicitudRest.remove(id_solicitud);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class SolicitudRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_solicitud=1;
        
        Solicitud solicitud=new Solicitud(id_solicitud);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSolicitudRest.create(solicitud)).thenReturn(expResult);
        
        Response result=mockSolicitudRest.create(solicitud);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class SolicitudRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_solicitud=1;
        
        Solicitud solicitud=new Solicitud(id_solicitud);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSolicitudRest.edit(id_solicitud,solicitud)).thenReturn(expResult);
        
        Response result=mockSolicitudRest.edit(id_solicitud,solicitud);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}
