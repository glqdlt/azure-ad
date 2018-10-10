package com.glqdlt.ex.aadspringboot;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class SomeController {

    @GetMapping("/")
    public String some(){
        return "hi";
    }


    @PreAuthorize("hasRole('group1')")
    @GetMapping("/hello")
    public String protectedSome(){
        return "protected";
    }
}
