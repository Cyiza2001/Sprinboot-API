package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import

@configuration 
public class StudentConfig {

    @Bean
 CommandLineRunner commandLineRunner (StudentRepository repository){
    return arg ->{
        new Student(
          id:1L,
          name:"Xander",
          email:"<EMAIL>",
          dob:LocalDate.of(2001,9,15),
          age:23

        );
    };
}
}
