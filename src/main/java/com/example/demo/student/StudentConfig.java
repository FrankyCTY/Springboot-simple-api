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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student tony = new Student(
                    1L,
                    "Tony",
                    "tony@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    1L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 5)
            );

            studentRepository.saveAll(List.of(tony, alex));
        };
    }

}
