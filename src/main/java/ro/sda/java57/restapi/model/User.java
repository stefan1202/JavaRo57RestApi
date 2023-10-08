package ro.sda.java57.restapi.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class User {

    @NotNull(message = "Name is required")
    @Length(min=3)
    private String name;
    @Email(message = "Email is incorrect")
    private String email;
    @NotNull
    private String lastName;
    @Positive
    private int age;
}
