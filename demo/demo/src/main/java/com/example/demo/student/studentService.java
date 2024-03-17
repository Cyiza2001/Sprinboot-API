package com.example.demo.student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class studentService {
  private final StudentRepository studentRepository;
@Autowired    
  public studentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }
  
      public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
