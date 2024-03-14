package com.example.demo.student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path ="api/v1/student")
public class studentController {
private studentService studentService1;

@Autowired
    public studentController(studentService studService) {
        this.studentService1 = studService;
    }
    @GetMapping("")
    public List<Student> getStudents() {
        return  studentService1.getStudents();
}
}

