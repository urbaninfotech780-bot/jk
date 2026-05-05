package it.nxtvision;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from NEW Demo Controller 🚀";
    }

    @GetMapping("/status")
    public String status() {
        return "Demo Controller is working fine ✅";
    }

    @GetMapping("/info")
    public String info() {
        return "This is a new Spring Boot Controller for testing APIs 📦";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong 🏓";
    }

    @PostMapping("/create")
    public String create() {
        return "Create API called (POST) ✔";
    }

    @PutMapping("/update")
    public String update() {
        return "Update API called (PUT) 🔄";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "Delete API called (DELETE) ❌";
    }
}