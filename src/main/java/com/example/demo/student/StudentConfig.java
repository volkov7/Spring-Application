package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ilya = new Student(
                1L,
                "Ilya",
                "Ilya@mail.ru",
                LocalDate.of(2000, Month.MAY, 26)
            );

            Student alex = new Student(
                "Alex",
                "Alex@mail.ru",
                LocalDate.of(2004, Month.MAY, 26)
            );

            repository.saveAll(
                List.of(ilya, alex)
            );
        };
    }
}
