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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Pasos;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PasosRest.class)
public class PasosRestTest {
    
    private Pasos mockPasos;
    private PasosRest mockPasosRest;
    
    public PasosRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockPasosRest=Mockito.mock(PasosRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class PasosRest.
     */
    @Test
    public void testFindAll() {

        Pasos pasos1=new Pasos();
        pasos1.setIdPasos(1);
        pasos1.setDescripcion("pasos1");
        
        Pasos pasos2=new Pasos();
        pasos2.setIdPasos(2);
        pasos2.setDescripcion("pasos2");

        List<Pasos> expResult=new ArrayList<>();
        expResult.add(pasos1);
        expResult.add(pasos2);
        
        Mockito.when(mockPasosRest.findAll()).thenReturn(expResult);
        
        List<Pasos> result=mockPasosRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class PasosRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockPasosRest.count()).thenReturn(expInteger);
        
        Integer result=mockPasosRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class PasosRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_pasos=1;
        Pasos expResult=new Pasos();
        expResult.setDescripcion("nombre");
        expResult.setIdPasos(1);
        
        Mockito.when(mockPasosRest.findById(id_pasos)).thenReturn(expResult);
        
        Pasos result=mockPasosRest.findById(id_pasos);
        
        assertEquals(id_pasos, result.getIdPasos());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class PasosRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_pasos=1;
        
        Pasos pasos=new Pasos(id_pasos);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosRest.remove(id_pasos)).thenReturn(expResult);
        
        Response result=mockPasosRest.remove(id_pasos);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class PasosRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_pasos=1;
        
        Pasos pasos=new Pasos(id_pasos);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosRest.create(pasos)).thenReturn(expResult);
        
        Response result=mockPasosRest.create(pasos);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class PasosRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_pasos=1;
        
        Pasos pasos=new Pasos(id_pasos);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockPasosRest.edit(id_pasos,pasos)).thenReturn(expResult);
        
        Response result=mockPasosRest.edit(id_pasos,pasos);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

