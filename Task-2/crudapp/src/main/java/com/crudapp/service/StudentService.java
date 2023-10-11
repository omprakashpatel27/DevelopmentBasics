package com.crudapp.service;

import com.crudapp.model.Student;
import com.crudapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public List<Student> getAllRecord(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student deleteRecord(String rollNumber){
        Student student = studentRepository.findById(rollNumber).orElse(null);
        if(student != null) studentRepository.delete(student);
        return student;
    }

    public Student updateRecord(String rollNumber,String name, String marksObtainedTenth, String marksObtainedTwelve){
        Student student = studentRepository.findById(rollNumber).orElse(null);
        if(student != null){
            student.setName(name);
            student.setMarksObtainedTenth(marksObtainedTenth);
            student.setMarksObtainedTwelve(marksObtainedTwelve);
            studentRepository.save(student);
        }
        return student;
    }
}
