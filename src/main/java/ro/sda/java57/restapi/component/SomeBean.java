package ro.sda.java57.restapi.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SomeBean implements CommandLineRunner {

    @Value("${ro.sda.java57.first}")
    private String readValue;

    @Value("${ro.sda.java57.second:defaulText}")
    private String readSecondValue;

    @Value("${java.home:defaulText}")
    private String javaHome;

    private final String constructorValue;

    public SomeBean(@Value("${ro.sda.java57.constructor}") String constructorValue) {
        this.constructorValue = constructorValue;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Am citit proprietatea: " + readValue);
        System.out.println("Am citit a doua proprietatea: " + readSecondValue);
        System.out.println("Am citit javaHome: " + javaHome);
        System.out.println("Valoarea primita la constructor este:" + constructorValue);
    }
}
