package ro.sda.java57.restapi.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.sda.java57.restapi.model.User;

@Controller
@ResponseBody
@RequestMapping("/test")
public class HelloController {

@RequestMapping
    public  String sayHello(){
        return "Hello";
    }

    @PostMapping
    public ResponseEntity<String> testPost(@RequestBody String message){
        return ResponseEntity.ok("Hello from " + message);
    }

    @PostMapping("/user")
    public ResponseEntity<String> testUser(@Valid @RequestBody User user){
        return ResponseEntity.ok("Hello from " + user);
    }

}
