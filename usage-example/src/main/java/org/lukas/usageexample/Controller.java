package org.lukas.usageexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {
    @Value("${custom.property}")
    private String property;
    
    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
    
    @GetMapping("/")
    public String getProperty() {
        return property;
    }
}
