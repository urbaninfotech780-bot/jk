package it.nxtvision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World there are dfdfdnlfd dfdfd the cha;ne from Spring Boot 🚀";
    }



    
    
    @GetMapping("/hdf")
    public String helo() {
        return "Hello World from Sprindfdfg Boot 🚀";
    }
}

