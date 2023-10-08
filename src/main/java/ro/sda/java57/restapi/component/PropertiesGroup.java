package ro.sda.java57.restapi.component;

import lombok.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "ro.sda.properties")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesGroup implements CommandLineRunner {
    private String propString;

    private Integer propInteger;

    private List<String> propList;

    private Map<String,Integer> propMap;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("I have been initialized as: " + this);
    }
}
