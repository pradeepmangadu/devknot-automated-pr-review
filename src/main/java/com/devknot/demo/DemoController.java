package com.devknot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name.trim();
    }
}
