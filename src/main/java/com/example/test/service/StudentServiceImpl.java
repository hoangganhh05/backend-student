package com.example.test.service;

import com.example.test.model.Student;
import com.example.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void add(Student student) {
        repository.save(student);
    }

    @Override
    public Student updateStudent(String id, Student newData) {
        Optional<Student> optional = repository.findById(id);
        if (optional.isPresent()) {
            Student existing = optional.get();
            existing.setName(newData.getName());
            existing.setAge(newData.getAge());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}