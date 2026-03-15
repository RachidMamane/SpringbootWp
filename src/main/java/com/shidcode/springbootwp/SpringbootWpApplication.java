package com.shidcode.springbootwp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWpApplication.class, args);
    }
    @GetMapping
    public String HelloWOrld(){
        return "Hello World";
    }

}
