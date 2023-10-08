package ro.sda.java57.restapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.java57.restapi.component.NumberGenerator;
import ro.sda.java57.restapi.exceptions.SdaException;

@RestController
@Profile("SIT")
public class NumberController {


    @GetMapping("/number")
    public int getNumber(HttpServletRequest httpRequest, NumberGenerator numberGenerator){
        System.out.println("Received " + httpRequest);
        int result=numberGenerator.getValue();
        if (result>0){
            throw new SdaException("Number generator returned positive number");
        }
        return result;
    }
}
