package com.nsv.soft.dev.lab.spring.example.controller;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class MyRestController {


    @GetMapping("/hello")
    @Counted(value = "greeting.count", description = "COUNT123")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/add")
    @Timed(value = "add.time", description = "Time taken to return greeting")
    public ResponseEntity<String> addData(@RequestBody String data) {
        return ResponseEntity.ok("Data added: " + data);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody String newData) {
        return ResponseEntity.ok("Data updated to: " + newData);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteData() {
        return ResponseEntity.ok("Data deleted");
    }
}