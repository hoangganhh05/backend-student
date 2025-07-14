package com.example.test.model;

import org.springframework.data.annotation.Id;

public class Student {
    private String name;
    @Id
    private String id;
    private int age;

    public Student() {
    }

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
