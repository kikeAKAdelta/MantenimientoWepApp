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
import sv.edu.uesocc.ingenieria.mantenimientolib.Calendario;

/**
 *
 * @author ivan
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(CalendarioRest.class)
public class CalendarioRestTest {
    
    private Calendario mockCalendario;
    private CalendarioRest mockCalendarioRest;
    
    public CalendarioRestTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        mockCalendarioRest=Mockito.mock(CalendarioRest.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class CalendarioRest.
     */
    @Test
    public void testFindAll() {

        Calendario calendario1=new Calendario();
        calendario1.setIdCalendario(1);
        calendario1.setDescripcion("calendario1");
        
        Calendario calendario2=new Calendario();
        calendario2.setIdCalendario(2);
        calendario2.setDescripcion("calendario2");

        List<Calendario> expResult=new ArrayList<>();
        expResult.add(calendario1);
        expResult.add(calendario2);
        
        Mockito.when(mockCalendarioRest.findAll()).thenReturn(expResult);
        
        List<Calendario> result=mockCalendarioRest.findAll();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of count method, of class CalendarioRest.
     */
    @Test
    public void testCount() {
        
        Integer expInteger=1;
        Mockito.when(mockCalendarioRest.count()).thenReturn(expInteger);
        
        Integer result=mockCalendarioRest.count();
        
        assertEquals(expInteger, result);
        
    }

    /**
     * Test of findById method, of class CalendarioRest.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        
        Integer id_calendario=1;
        Calendario expResult=new Calendario();
        expResult.setDescripcion("nombre");
        expResult.setIdCalendario(1);
        
        Mockito.when(mockCalendarioRest.findById(id_calendario)).thenReturn(expResult);
        
        Calendario result=mockCalendarioRest.findById(id_calendario);
        
        assertEquals(id_calendario, result.getIdCalendario());
        assertEquals(expResult, result);
        
    }

    /**
     * Test of remove method, of class CalendarioRest.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        Integer id_calendario=1;
        
        Calendario calendario=new Calendario(id_calendario);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockCalendarioRest.remove(id_calendario)).thenReturn(expResult);
        
        Response result=mockCalendarioRest.remove(id_calendario);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of create method, of class CalendarioRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Integer id_calendario=1;
        
        Calendario calendario=new Calendario(id_calendario);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockCalendarioRest.create(calendario)).thenReturn(expResult);
        
        Response result=mockCalendarioRest.create(calendario);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class CalendarioRest.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Integer id_calendario=1;
        
        Calendario calendario=new Calendario(id_calendario);
        
        Response expResult=Response.status(Response.Status.OK).build();
        
        assertNotNull(expResult);
        
        Mockito.when(mockCalendarioRest.edit(id_calendario,calendario)).thenReturn(expResult);
        
        Response result=mockCalendarioRest.edit(id_calendario,calendario);
        
        assertEquals(expResult, result);
        
        
        
        
    }
    
}