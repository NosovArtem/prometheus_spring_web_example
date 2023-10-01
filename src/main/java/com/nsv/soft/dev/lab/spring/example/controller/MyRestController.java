package com.nsv.soft.dev.lab.spring.example.controller;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class MyRestController {


    @GetMapping("/hello")
    @Counted(value = "greeting.count", description = "@Counted - Count taken to return greeting")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/show")
    @Timed(value = "show.time", description = "@Timed - Time taken to return show")
    public String showSomething() {
        return "Show something";
    }

    @PostMapping("/add")
    @Timed(value = "add.data", description = "@Timed - addData")
    public ResponseEntity<String> addData(@RequestBody String data) {
        return ResponseEntity.ok("Data added: " + data);
    }

    @PutMapping("/update")
    @Timed(value = "update.data", description = "@Timed - updateData")
    public ResponseEntity<String> updateData(@RequestBody String newData) {
        return ResponseEntity.ok("Data updated to: " + newData);
    }

    @DeleteMapping("/delete")
    @Timed(value = "delete.data", description = "@Timed - deleteData")
    public ResponseEntity<String> deleteData() {
        return ResponseEntity.ok("Data deleted");
    }
}