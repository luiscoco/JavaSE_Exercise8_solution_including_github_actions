package com.example;

import java.util.*;

public class University {
    private String name;
    private String address;
    private List<Faculty> faculties;
    private List<Student> students;
    private List<Teacher> teachers;
    
    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.faculties = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public List<Faculty> getFaculties() {
        return faculties;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    @Override
    public String toString() {
        return "University: " + name + ", Address: " + address;
    }
}
