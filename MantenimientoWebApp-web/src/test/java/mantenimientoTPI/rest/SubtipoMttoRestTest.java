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
import sv.edu.uesocc.ingenieria.mantenimientolib.SubtipoMtto;

/**
 *
 * @author enrique
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SubtipoMttoRest.class)
public class SubtipoMttoRestTest {
    
    private SubtipoMtto mockSubtipoMtto;
    private SubtipoMttoRest mockSubtipoMttoRest;
    
    public SubtipoMttoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockSubtipoMttoRest=Mockito.mock(SubtipoMttoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class SubtipoMttoRest.
     */
    @Test
    public void testFindAll() {

        SubtipoMtto subtipoMtto1=new SubtipoMtto();
        subtipoMtto1.setDescripcion("subtipoMtto1");
        
        SubtipoMtto subtipoMtto2=new SubtipoMtto();
        subtipoMtto2.setDescripcion("subtipoMtto2");

        List<SubtipoMtto> expResult=new ArrayList<>();
        expResult.add(subtipoMtto1);
        expResult.add(subtipoMtto2);
        
        Mockito.when(mockSubtipoMttoRest.findAll()).thenReturn(expResult);
        
        List<SubtipoMtto> result=mockSubtipoMttoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class SubtipoMttoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockSubtipoMttoRest.count()).thenReturn(expInteger);
        
        Integer result=mockSubtipoMttoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class SubtipoMttoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_subtipoMtto=1;
        SubtipoMtto expResult=new SubtipoMtto();
        expResult.setDescripcion("nombre");
        
        Mockito.when(mockSubtipoMttoRest.findById(id_subtipoMtto)).thenReturn(expResult);
        
        SubtipoMtto result=mockSubtipoMttoRest.findById(id_subtipoMtto);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class SubtipoMttoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_subtipoMtto=1;
        
        SubtipoMtto subtipoMtto=new SubtipoMtto(id_subtipoMtto,1);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSubtipoMttoRest.remove(id_subtipoMtto,1)).thenReturn(expResult);
        
        Response result=mockSubtipoMttoRest.remove(id_subtipoMtto,1);
        
        assertEquals(expResult.getStatus(), result.getStatus());
        
    }

    /**
     * Test of create method, of class SubtipoMttoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_subtipoMtto=1;
        
        SubtipoMtto subtipoMtto=new SubtipoMtto(id_subtipoMtto,1);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSubtipoMttoRest.create(subtipoMtto)).thenReturn(expResult);
        
        Response result=mockSubtipoMttoRest.create(subtipoMtto);
        
        assertEquals(expResult.getStatus(), result.getStatus());
    }

    /**
     * Test of edit method, of class SubtipoMttoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_subtipoMtto=1;
        
        SubtipoMtto subtipoMtto=new SubtipoMtto(id_subtipoMtto,1);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockSubtipoMttoRest.edit(id_subtipoMtto,subtipoMtto)).thenReturn(expResult);
        
        Response result=mockSubtipoMttoRest.edit(id_subtipoMtto,subtipoMtto);
        
        assertEquals(expResult.getStatus(), result.getStatus());
        
        
        
        
    }
    
}