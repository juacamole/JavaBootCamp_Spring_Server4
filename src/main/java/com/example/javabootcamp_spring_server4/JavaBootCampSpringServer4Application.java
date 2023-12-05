package com.example.javabootcamp_spring_server4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.processing.Generated;

@SpringBootApplication
public class JavaBootCampSpringServer4Application {
    public static void main(String[] args) {
        SpringApplication.run(JavaBootCampSpringServer4Application.class, args);
    }


@GetMapping("/hello")
public String helo(){
    return "Hello world";
}
}
