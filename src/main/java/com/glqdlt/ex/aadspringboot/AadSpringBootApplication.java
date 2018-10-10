package com.glqdlt.ex.aadspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.glqdlt.**","com.microsoft.**"})
@SpringBootApplication
public class AadSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AadSpringBootApplication.class, args);
    }
}
