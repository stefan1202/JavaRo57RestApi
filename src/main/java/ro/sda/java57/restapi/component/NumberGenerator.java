package ro.sda.java57.restapi.component;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Getter
@Component

@RequestScope
public class NumberGenerator {
    private final int value = new Random().nextInt();
}
