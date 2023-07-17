package com.example;

import java.util.*;

public class Department {
    private String name;
    private List<Course> courses;
    
    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public List<Course> getCourses() {
        return courses;
    }
    
    @Override
    public String toString() {
        return "Department: " + name;
    }
}
