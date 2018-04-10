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
import sv.edu.uesocc.ingenieria.mantenimientolib.PasosProcedimiento;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PasosProcedimientoRest.class)
public class PasosProcedimientoRestTest {
    
    private PasosProcedimiento mockPasosProcedimiento;
    private PasosProcedimientoRest mockPasosProcedimientoRest;
    
    public PasosProcedimientoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockPasosProcedimientoRest=Mockito.mock(PasosProcedimientoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class PasosProcedimientoRest.
     */
    @Test
    public void testFindAll() {

        PasosProcedimiento pasosProcedimiento1=new PasosProcedimiento();
        pasosProcedimiento1.setProcedimiento(1);
        
        PasosProcedimiento pasosProcedimiento2=new PasosProcedimiento();
        pasosProcedimiento2.setProcedimiento(2);

        List<PasosProcedimiento> expResult=new ArrayList<>();
        expResult.add(pasosProcedimiento1);
        expResult.add(pasosProcedimiento2);
        
        Mockito.when(mockPasosProcedimientoRest.findAll()).thenReturn(expResult);
        
        List<PasosProcedimiento> result=mockPasosProcedimientoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class PasosProcedimientoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockPasosProcedimientoRest.count()).thenReturn(expInteger);
        
        Integer result=mockPasosProcedimientoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class PasosProcedimientoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_pasosProcedimiento=1;
        PasosProcedimiento expResult=new PasosProcedimiento();
        
        expResult.setProcedimiento(1);
        
        Mockito.when(mockPasosProcedimientoRest.findById(id_pasosProcedimiento)).thenReturn(expResult);
        
        PasosProcedimiento result=mockPasosProcedimientoRest.findById(id_pasosProcedimiento);
        
        assertEquals(id_pasosProcedimiento, result.getProcedimiento());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class PasosProcedimientoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_pasosProcedimiento=1;
        
        PasosProcedimiento pasosProcedimiento=new PasosProcedimiento(id_pasosProcedimiento);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosProcedimientoRest.remove(id_pasosProcedimiento)).thenReturn(expResult);
        
        Response result=mockPasosProcedimientoRest.remove(id_pasosProcedimiento);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class PasosProcedimientoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_pasosProcedimiento=1;
        
        PasosProcedimiento pasosProcedimiento=new PasosProcedimiento(id_pasosProcedimiento);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosProcedimientoRest.create(pasosProcedimiento)).thenReturn(expResult);
        
        Response result=mockPasosProcedimientoRest.create(pasosProcedimiento);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class PasosProcedimientoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_pasosProcedimiento=1;
        
        PasosProcedimiento pasosProcedimiento=new PasosProcedimiento(id_pasosProcedimiento);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosProcedimientoRest.edit(id_pasosProcedimiento,pasosProcedimiento)).thenReturn(expResult);
        
        Response result=mockPasosProcedimientoRest.edit(id_pasosProcedimiento,pasosProcedimiento);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

