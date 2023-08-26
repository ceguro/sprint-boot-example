package com.eduardopractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("Hello",
                List.of("Java", "Kotlin", "Ruby"),
                new Person("Edu", 38, 100_000));
    }


    record Person (String name, int age, double savings){}
    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){

    }
}
