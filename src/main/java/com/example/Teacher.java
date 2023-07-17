package com.example;

import java.util.*;

public class Teacher extends Person {
    private String teacherId;
    private List<Course> courses;
    
    public Teacher(String teacherId, String name, String address, String phone) {
        super(teacherId, name, address, phone);
        this.teacherId = teacherId;
        this.courses = new ArrayList<>();
    }
    
    public String getTeacherId() {
        return teacherId;
    }
    
    public void teachCourse(Course course) {
        courses.add(course);
    }
    
    public List<Course> getAssignedCourses() {
        return courses;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Teacher ID: " + teacherId;
    }
}
