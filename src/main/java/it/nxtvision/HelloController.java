package it.nxtvision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World there are dfdfdnlfd dfdfd the cha;ne from Spring Boot 🚀";
    }


   @GetMapping("/hdd")
    public String hedlo() {
        return "Hello World i will  from Sprindfdfg Boot 🚀";
    }
    
    
    @GetMapping("/hdf")
    public String helo() {
        return "Hello World from Sprindfdfg Boot 🚀";
    }
    
    @GetMapping("/dfd")
    public String heldo() {
        return "Hello World from Sprindfdfg Boot 🚀";
    }
    
    

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully ✅";
    }

    @GetMapping("/health")
    public String health() {
        return "OK - Service Healthy 💚";
    }

    @GetMapping("/version")
    public String version() {
        return "Spring Boot Version API v1.0.0 📦";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to our Spring Boot API 👋";
    }
    
    
}

