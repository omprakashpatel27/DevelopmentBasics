package com.crudapp.controller;

import com.crudapp.model.Student;
import com.crudapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/health")
    public String healthApi(){
        return "Working...";
    }

    @GetMapping("/fetch-all")
    public List<Student> fetchAllRecords(){
        return studentService.getAllRecord();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/update")
    public Student updateRecord(@RequestBody Student student){
        return studentService.updateRecord(student.getRollNumber(), student.getName(),student.getMarksObtainedTenth(),student.getMarksObtainedTwelve());
    }

    @DeleteMapping("/delete/{rollNumber}")
    public Student deleteRecord(@PathVariable String rollNumber){
        return studentService.deleteRecord(rollNumber);
    }
}
