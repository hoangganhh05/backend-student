package com.example.test.repository;

import com.example.test.model.Student;
import java.util.*;

import com.example.test.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
