package com.ilyaselmabrouki.demo.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student ilyas = new Student("Ilyas", "ilyas@gmail.com", LocalDate.of(2002, Month.JUNE, 27), 21);
            Student mouad = new Student("Mouad","mouad@gmail.com",LocalDate.of(2002, Month.FEBRUARY, 8), 21);

            studentRepository.saveAll(List.of(ilyas,mouad));
        };
    }
}
