package ru.lukah.bellproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lukah.bellproject.Model.Organization;

@SpringBootApplication
public class BellProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BellProjectApplication.class, args);
    }

}

