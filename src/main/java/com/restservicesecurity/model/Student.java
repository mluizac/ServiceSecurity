package com.restservicesecurity.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {

    private String id;
    private String name;
    private String description;
    private List<Course> courses;

    public Student(String id, String name, String description, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.courses = courses;
    }
}
