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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Responsable;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ResponsableRest.class)
public class ResponsableRestTest {
    
    private Responsable mockResponsable;
    private ResponsableRest mockResponsableRest;
    
    public ResponsableRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockResponsableRest=Mockito.mock(ResponsableRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class ResponsableRest.
     */
    @Test
    public void testFindAll() {

        Responsable responsable1=new Responsable();
        responsable1.setIdResponsable(1);
        responsable1.setIdentificador(1);
        
        Responsable responsable2=new Responsable();
        responsable2.setIdResponsable(2);
        responsable2.setIdentificador(2);

        List<Responsable> expResult=new ArrayList<>();
        expResult.add(responsable1);
        expResult.add(responsable2);
        
        Mockito.when(mockResponsableRest.findAll()).thenReturn(expResult);
        
        List<Responsable> result=mockResponsableRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class ResponsableRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockResponsableRest.count()).thenReturn(expInteger);
        
        Integer result=mockResponsableRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class ResponsableRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_responsable=1;
        Responsable expResult=new Responsable();
        expResult.setIdentificador(1);
        expResult.setIdResponsable(1);
        
        Mockito.when(mockResponsableRest.findById(id_responsable)).thenReturn(expResult);
        
        Responsable result=mockResponsableRest.findById(id_responsable);
        
        assertEquals(id_responsable, result.getIdResponsable());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class ResponsableRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_responsable=1;
        
        Responsable responsable=new Responsable(id_responsable);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockResponsableRest.remove(id_responsable)).thenReturn(expResult);
        
        Response result=mockResponsableRest.remove(id_responsable);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class ResponsableRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_responsable=1;
        
        Responsable responsable=new Responsable(id_responsable);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockResponsableRest.create(responsable)).thenReturn(expResult);
        
        Response result=mockResponsableRest.create(responsable);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class ResponsableRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_responsable=1;
        
        Responsable responsable=new Responsable(id_responsable);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockResponsableRest.edit(id_responsable,responsable)).thenReturn(expResult);
        
        Response result=mockResponsableRest.edit(id_responsable,responsable);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

