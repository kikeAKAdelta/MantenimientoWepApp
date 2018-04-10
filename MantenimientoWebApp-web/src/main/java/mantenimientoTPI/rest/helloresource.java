/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientoTPI.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */

@RestController
@RequestMapping("/hello")
public class helloresource {
    
    private HelloService helloService;

    public helloresource(HelloService helloService) {
        this.helloService = helloService;
    }


    @GetMapping
    public String helloWorld() {
        return helloService.hello();
    }


    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello json() {
        return new Hello("Greetings", "Hello World");
    }

    @PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello post(@RequestBody Hello hello) {
        return hello;
    }

    public static class Hello {

        private String title;
        private String value;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Hello(String title, String value) {
            this.title = title;
            this.value = value;
        }

        public Hello() {
        }
    }
}
