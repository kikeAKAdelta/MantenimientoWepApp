//package mantenimientoTPI.rest;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.ws.rs.core.Response;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//import sv.edu.uesocc.ingenieria.mantenimientolib.DiagnosticoParte;
//
///**
// *
// * @author enrique
// */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(DiagnosticoParteRest.class)
//public class DiagnosticoParteRestTest {
//    
//    private DiagnosticoParte mockDiagnosticoParte;
//    private DiagnosticoParteRest mockDiagnosticoParteRest;
//    
//    public DiagnosticoParteRestTest() {
//       
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//        
//        mockDiagnosticoParteRest=Mockito.mock(DiagnosticoParteRest.class);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of findAll method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testFindAll() {
//
//        DiagnosticoParte diagnosticoParte1=new DiagnosticoParte();
//        diagnosticoParte1.setDescripcion("diagnosticoParte1");
//        
//        DiagnosticoParte diagnosticoParte2=new DiagnosticoParte();
//        diagnosticoParte2.setDescripcion("diagnosticoParte2");
//
//        List<DiagnosticoParte> expResult=new ArrayList<>();
//        expResult.add(diagnosticoParte1);
//        expResult.add(diagnosticoParte2);
//        
//        Mockito.when(mockDiagnosticoParteRest.findAll()).thenReturn(expResult);
//        
//        List<DiagnosticoParte> result=mockDiagnosticoParteRest.findAll();
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of count method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testCount() {
//        
//        Integer expInteger=1;
//        Mockito.when(mockDiagnosticoParteRest.count()).thenReturn(expInteger);
//        
//        Integer result=mockDiagnosticoParteRest.count();
//        
//        assertEquals(expInteger, result);
//        
//    }
//
//    /**
//     * Test of findById method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        
//        Integer id_diagnosticoParte=1;
//        DiagnosticoParte expResult=new DiagnosticoParte();
//        expResult.setDescripcion("nombre");
//        
//        Mockito.when(mockDiagnosticoParteRest.findById(id_diagnosticoParte)).thenReturn(expResult);
//        
//        DiagnosticoParte result=mockDiagnosticoParteRest.findById(id_diagnosticoParte);
//        
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of remove method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//
//        Integer id_diagnosticoParte=1;
//        
//        DiagnosticoParte diagnosticoParte=new DiagnosticoParte(id_diagnosticoParte,1);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockDiagnosticoParteRest.remove(id_diagnosticoParte,1)).thenReturn(expResult);
//        
//        Response result=mockDiagnosticoParteRest.remove(id_diagnosticoParte,1);
//        
//        assertEquals(expResult.getStatus(), result.getStatus());
//        
//    }
//
//    /**
//     * Test of create method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        Integer id_diagnosticoParte=1;
//        
//        DiagnosticoParte diagnosticoParte=new DiagnosticoParte(id_diagnosticoParte,1);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockDiagnosticoParteRest.create(diagnosticoParte)).thenReturn(expResult);
//        
//        Response result=mockDiagnosticoParteRest.create(diagnosticoParte);
//        
//        assertEquals(expResult.getStatus(), result.getStatus());
//    }
//
//    /**
//     * Test of edit method, of class DiagnosticoParteRest.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        Integer id_diagnosticoParte=1;
//        
//        DiagnosticoParte diagnosticoParte=new DiagnosticoParte(id_diagnosticoParte,1);
//        
//        Response expResult=Response.status(Response.Status.OK).build();
//        
//        assertNotNull(expResult);
//        
//        Mockito.when(mockDiagnosticoParteRest.edit(id_diagnosticoParte,diagnosticoParte)).thenReturn(expResult);
//        
//        Response result=mockDiagnosticoParteRest.edit(id_diagnosticoParte,diagnosticoParte);
//        
//        assertEquals(expResult.getStatus(), result.getStatus());
//        
//        
//        
//        
//    }
//    
//}