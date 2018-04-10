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
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MttoDetalleRest.class)
public class MttoDetalleRestTest {
    
    private MttoDetalle mockMttoDetalle;
    private MttoDetalleRest mockMttoDetalleRest;
    
    public MttoDetalleRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockMttoDetalleRest=Mockito.mock(MttoDetalleRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class MttoDetalleRest.
     */
    @Test
    public void testFindAll() {

        MttoDetalle mttoDetalle1=new MttoDetalle();
        mttoDetalle1.setIdMttoDetalle(1);
        
        MttoDetalle mttoDetalle2=new MttoDetalle();
        mttoDetalle2.setIdMttoDetalle(2);

        List<MttoDetalle> expResult=new ArrayList<>();
        expResult.add(mttoDetalle1);
        expResult.add(mttoDetalle2);
        
        Mockito.when(mockMttoDetalleRest.findAll()).thenReturn(expResult);
        
        List<MttoDetalle> result=mockMttoDetalleRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class MttoDetalleRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockMttoDetalleRest.count()).thenReturn(expInteger);
        
        Integer result=mockMttoDetalleRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class MttoDetalleRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_mttoDetalle=1;
        MttoDetalle expResult=new MttoDetalle();
        expResult.setIdMttoDetalle(1);
        
        Mockito.when(mockMttoDetalleRest.findById(id_mttoDetalle)).thenReturn(expResult);
        
        MttoDetalle result=mockMttoDetalleRest.findById(id_mttoDetalle);
        
        assertEquals(id_mttoDetalle, result.getIdMttoDetalle());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class MttoDetalleRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_mttoDetalle=1;
        
        MttoDetalle mttoDetalle=new MttoDetalle(id_mttoDetalle);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockMttoDetalleRest.remove(id_mttoDetalle)).thenReturn(expResult);
        
        Response result=mockMttoDetalleRest.remove(id_mttoDetalle);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class MttoDetalleRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_mttoDetalle=1;
        
        MttoDetalle mttoDetalle=new MttoDetalle(id_mttoDetalle);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockMttoDetalleRest.create(mttoDetalle)).thenReturn(expResult);
        
        Response result=mockMttoDetalleRest.create(mttoDetalle);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class MttoDetalleRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_mttoDetalle=1;
        
        MttoDetalle mttoDetalle=new MttoDetalle(id_mttoDetalle);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockMttoDetalleRest.edit(id_mttoDetalle,mttoDetalle)).thenReturn(expResult);
        
        Response result=mockMttoDetalleRest.edit(id_mttoDetalle,mttoDetalle);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}

