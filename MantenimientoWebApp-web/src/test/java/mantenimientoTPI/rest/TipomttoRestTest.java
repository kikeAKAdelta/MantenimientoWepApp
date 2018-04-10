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
import sv.edu.uesocc.ingenieria.mantenimientolib.Tipomtto;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(TipomttoRest.class)
public class TipomttoRestTest {
    
    private Tipomtto mockTipomtto;
    private TipomttoRest mockTipomttoRest;
    
    public TipomttoRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockTipomttoRest=Mockito.mock(TipomttoRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class TipomttoRest.
     */
    @Test
    public void testFindAll() {

        Tipomtto tipomtto1=new Tipomtto();
        tipomtto1.setIdTipomtto(1);
        tipomtto1.setDescripcion("tipomtto1");
        
        Tipomtto tipomtto2=new Tipomtto();
        tipomtto2.setIdTipomtto(2);
        tipomtto2.setDescripcion("tipomtto2");

        List<Tipomtto> expResult=new ArrayList<>();
        expResult.add(tipomtto1);
        expResult.add(tipomtto2);
        
        Mockito.when(mockTipomttoRest.findAll()).thenReturn(expResult);
        
        List<Tipomtto> result=mockTipomttoRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class TipomttoRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockTipomttoRest.count()).thenReturn(expInteger);
        
        Integer result=mockTipomttoRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class TipomttoRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_tipomtto=1;
        Tipomtto expResult=new Tipomtto();
        expResult.setDescripcion("nombre");
        expResult.setIdTipomtto(1);
        
        Mockito.when(mockTipomttoRest.findById(id_tipomtto)).thenReturn(expResult);
        
        Tipomtto result=mockTipomttoRest.findById(id_tipomtto);
        
        assertEquals(id_tipomtto, result.getIdTipomtto());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class TipomttoRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_tipomtto=1;
        
        Tipomtto tipomtto=new Tipomtto(id_tipomtto);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockTipomttoRest.remove(id_tipomtto)).thenReturn(expResult);
        
        Response result=mockTipomttoRest.remove(id_tipomtto);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class TipomttoRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_tipomtto=1;
        
        Tipomtto tipomtto=new Tipomtto(id_tipomtto);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockTipomttoRest.create(tipomtto)).thenReturn(expResult);
        
        Response result=mockTipomttoRest.create(tipomtto);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class TipomttoRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_tipomtto=1;
        
        Tipomtto tipomtto=new Tipomtto(id_tipomtto);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockTipomttoRest.edit(id_tipomtto,tipomtto)).thenReturn(expResult);
        
        Response result=mockTipomttoRest.edit(id_tipomtto,tipomtto);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

