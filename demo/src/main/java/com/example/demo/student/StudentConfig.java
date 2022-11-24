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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ximena = new Student("Ximena","ximena@gmail.com", LocalDate.of(1995, Month.MARCH,10));
            Student alejandro = new Student("Alejandro","alejandro@gmail.com", LocalDate.of(1980, Month.SEPTEMBER,28));
            repository.saveAll(
                    List.of(ximena,alejandro)
            );
        };
    }
}
