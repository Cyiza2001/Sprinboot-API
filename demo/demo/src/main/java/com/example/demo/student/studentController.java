package com.example.demo.student;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;

@RestController
@RequestMapping(path ="api/v1/student")
public class studentController {

    @GetMapping("")
    public List<Student> getStudents() {
        return  List.of(
            new Student(1L,"Xander","imbwa@gmail.com", LocalDate.of(2001,9,15),23));
    }
}

