package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class studentService {
      public List<Student> getStudents() {
        return  List.of(
            new Student(1L,"Xander","imbwa@gmail.com", LocalDate.of(2001,9,15),23));
    }

}
