package com.github.myselfakashagarwal.experiments.designpatterns.core.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    // 1. Basic GET request
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the Design Patterns Core Module!";
    }

    // 2. GET request with Path Variable
    @GetMapping("/greet/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to the component generator.";
    }

    // 3. POST request with Request Body
    @PostMapping("/echo")
    public String echoData(@RequestBody String data) {
        return "Received your data: " + data;
    }
}
