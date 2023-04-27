package com.demo.dockerspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/bye")
    public String getBye() { return "Bye World"; }

}
