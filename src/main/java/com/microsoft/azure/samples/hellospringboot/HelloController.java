package com.microsoft.azure.samples.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Azure!";
    }
}
