/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import sv.edu.uesocc.ingenieria.mantenimientolib.Unidad;

/**
 *
 * @author enrique
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UnidadRest.class)
public class UnidadRestTest {
    
    private Unidad mockUnidad;
    private UnidadRest mockUnidadRest;
    
    public UnidadRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockUnidadRest=Mockito.mock(UnidadRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class UnidadRest.
     */
    @Test
    public void testFindAll() {

        Unidad unidad1=new Unidad();
        unidad1.setIdUnidad(1);
        unidad1.setNombreUnidad("unidad1");
        
        Unidad unidad2=new Unidad();
        unidad2.setIdUnidad(2);
        unidad2.setNombreUnidad("unidad2");

        List<Unidad> expResult=new ArrayList<>();
        expResult.add(unidad1);
        expResult.add(unidad2);
        
        Mockito.when(mockUnidadRest.findAll()).thenReturn(expResult);
        
        List<Unidad> result=mockUnidadRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class UnidadRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockUnidadRest.count()).thenReturn(expInteger);
        
        Integer result=mockUnidadRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class UnidadRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_unidad=1;
        Unidad expResult=new Unidad();
        expResult.setNombreUnidad("nombre");
        expResult.setIdUnidad(1);
        
        Mockito.when(mockUnidadRest.findById(id_unidad)).thenReturn(expResult);
        
        Unidad result=mockUnidadRest.findById(id_unidad);
        
        assertEquals(id_unidad, result.getIdUnidad());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class UnidadRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_unidad=1;
        
        Mockito.doNothing().when(mockUnidadRest).remove(id_unidad); //metodo void
        
        mockUnidadRest.remove(id_unidad);
        
    }

    /**
     * Test of create method, of class UnidadRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Unidad unidad1=new Unidad(1);
        
        Mockito.doNothing().when(mockUnidadRest).create(unidad1);
        
        mockUnidadRest.create(unidad1);
        
    }

    /**
     * Test of edit method, of class UnidadRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Unidad uni=new Unidad(1);
        Integer id=new Integer(1);
        
        Mockito.doNothing().when(mockUnidadRest).edit(id,uni);
        
        mockUnidadRest.edit(id,uni);
        
    }
    
}
