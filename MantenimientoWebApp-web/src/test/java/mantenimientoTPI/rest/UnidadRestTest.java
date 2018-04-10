/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 * @author LENOVO
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UnidadRestTest {
    
   private MockMvc mockMvc;

    @Mock
    private UnidadService unidadservice;

    @InjectMocks
    private UnidadRest unidadrest;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(unidadrest)
                .build();
    }

    @Test
    public void testHelloWorld() throws Exception {

        when(unidadservice.nueva()).thenReturn("001");

        mockMvc.perform(get("/Monitor"))
                .andExpect(status().isOk())
                .andExpect(content().string("001"));

        verify(unidadservice).nueva();
    }

    @Test
    public void testHelloWorldJson() throws Exception {
        mockMvc.perform(get("/001/json")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idUnidad", Matchers.is("001")));
              
    }

    @Test
    public void testPost() throws Exception {
        String json = "{\n" +
                "  \"idUnidad\": \"001\",\n" +
                "}";
        mockMvc.perform(post("/001/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", Matchers.is("001")));
    }
  
    
}
