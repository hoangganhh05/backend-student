package com.example.test.service;

import com.example.test.model.Student;
import java.util.*;

public interface StudentService {
    List<Student> getAll();
    Student getById(String id);
    void add(Student student);
    public Student updateStudent(String id, Student newData);
    void delete(String id);
}
