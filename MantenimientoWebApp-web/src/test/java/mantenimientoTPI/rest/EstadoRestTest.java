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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Estado;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(EstadoRest.class)
public class EstadoRestTest {
    
    private Estado mockEstado;
    private EstadoRest mockEstadoRest;
    
    public EstadoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockEstadoRest=Mockito.mock(EstadoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class EstadoRest.
     */
    @Test
    public void testFindAll() {

        Estado estado1=new Estado();
        estado1.setIdEstado(1);
        estado1.setDescripcion("estado1");
        
        Estado estado2=new Estado();
        estado2.setIdEstado(2);
        estado2.setDescripcion("estado2");

        List<Estado> expResult=new ArrayList<>();
        expResult.add(estado1);
        expResult.add(estado2);
        
        Mockito.when(mockEstadoRest.findAll()).thenReturn(expResult);
        
        List<Estado> result=mockEstadoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class EstadoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockEstadoRest.count()).thenReturn(expInteger);
        
        Integer result=mockEstadoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class EstadoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_estado=1;
        Estado expResult=new Estado();
        expResult.setDescripcion("nombre");
        expResult.setIdEstado(1);
        
        Mockito.when(mockEstadoRest.findById(id_estado)).thenReturn(expResult);
        
        Estado result=mockEstadoRest.findById(id_estado);
        
        assertEquals(id_estado, result.getIdEstado());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class EstadoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_estado=1;
        
        Estado estado=new Estado(id_estado);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockEstadoRest.remove(id_estado)).thenReturn(expResult);
        
        Response result=mockEstadoRest.remove(id_estado);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class EstadoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_estado=1;
        
        Estado estado=new Estado(id_estado);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockEstadoRest.create(estado)).thenReturn(expResult);
        
        Response result=mockEstadoRest.create(estado);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class EstadoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_estado=1;
        
        Estado estado=new Estado(id_estado);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockEstadoRest.edit(id_estado,estado)).thenReturn(expResult);
        
        Response result=mockEstadoRest.edit(id_estado,estado);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

