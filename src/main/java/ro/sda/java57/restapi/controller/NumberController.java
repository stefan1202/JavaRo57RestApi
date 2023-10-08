package ro.sda.java57.restapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.java57.restapi.component.NumberGenerator;

@RestController
public class NumberController {


    @GetMapping("/number")
    public int getNumber(HttpServletRequest httpRequest, NumberGenerator numberGenerator){
        System.out.println("Received " + httpRequest);
        return numberGenerator.getValue();
    }
}
