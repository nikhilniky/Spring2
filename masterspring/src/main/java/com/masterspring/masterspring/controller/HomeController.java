package com.masterspring.masterspring.controller;

import com.masterspring.masterspring.DObjects.Employee;
import com.masterspring.masterspring.DObjects.User;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()   // This means that this class is a Controller+ response body
public class HomeController {
    @RequestMapping("/")
    public String test() {
        return "<html><h1>hello world</h1></html>";
    }

    @GetMapping("/user")
    public User user() {

        return new User.Builder()
                .withName("John")
                .withAge(25)
                .build();
    }

    @GetMapping("/user/{id}/{name}")
     public ResponseEntity<String> user2(@PathVariable int id, @PathVariable("name") String createdby) {

        return ResponseEntity.ok("userid "+id+" created by "+createdby);
    }

    @GetMapping("/user/query")
    public ResponseEntity<HttpStatus> userquery(@RequestParam String name,
                                                @RequestParam(required = false,defaultValue = "") String mail) {

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/employee")
    public Employee employee() {
        return new Employee.Builder()
                .setAge(25)
                .Firstname("John")
                .Lastname("Doe")
                .build();
    }
}
