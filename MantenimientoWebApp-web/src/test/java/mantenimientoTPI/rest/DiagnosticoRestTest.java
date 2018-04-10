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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Diagnostico;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DiagnosticoRest.class)
public class DiagnosticoRestTest {
    
    private Diagnostico mockDiagnostico;
    private DiagnosticoRest mockDiagnosticoRest;
    
    public DiagnosticoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockDiagnosticoRest=Mockito.mock(DiagnosticoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class DiagnosticoRest.
     */
    @Test
    public void testFindAll() {

        Diagnostico diagnostico1=new Diagnostico();
        diagnostico1.setIdDiagnostico(1);
        diagnostico1.setDescripcion("nombre");
        
        Diagnostico diagnostico2=new Diagnostico();
        diagnostico2.setIdDiagnostico(2);
        diagnostico2.setDescripcion("nombre");

        List<Diagnostico> expResult=new ArrayList<>();
        expResult.add(diagnostico1);
        expResult.add(diagnostico2);
        
        Mockito.when(mockDiagnosticoRest.findAll()).thenReturn(expResult);
        
        List<Diagnostico> result=mockDiagnosticoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class DiagnosticoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockDiagnosticoRest.count()).thenReturn(expInteger);
        
        Integer result=mockDiagnosticoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class DiagnosticoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_diagnostico=1;
        Diagnostico expResult=new Diagnostico();
        expResult.setDescripcion("nombre");
        expResult.setIdDiagnostico(1);
        
        Mockito.when(mockDiagnosticoRest.findById(id_diagnostico)).thenReturn(expResult);
        
        Diagnostico result=mockDiagnosticoRest.findById(id_diagnostico);
        
        assertEquals(id_diagnostico, result.getIdDiagnostico());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class DiagnosticoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_diagnostico=1;
        
        Diagnostico diagnostico=new Diagnostico(id_diagnostico);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDiagnosticoRest.remove(id_diagnostico)).thenReturn(expResult);
        
        Response result=mockDiagnosticoRest.remove(id_diagnostico);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class DiagnosticoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_diagnostico=1;
        
        Diagnostico diagnostico=new Diagnostico(id_diagnostico);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDiagnosticoRest.create(diagnostico)).thenReturn(expResult);
        
        Response result=mockDiagnosticoRest.create(diagnostico);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class DiagnosticoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_diagnostico=1;
        
        Diagnostico diagnostico=new Diagnostico(id_diagnostico);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockDiagnosticoRest.edit(id_diagnostico,diagnostico)).thenReturn(expResult);
        
        Response result=mockDiagnosticoRest.edit(id_diagnostico,diagnostico);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}
