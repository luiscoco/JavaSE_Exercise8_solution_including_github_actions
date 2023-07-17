package com.example;

import java.util.*;

public class Student extends Person {
    private String studentId;
    private List<Course> courses;
    private Map<Course, List<Date>> attendance;
    private Map<Course, List<Integer>> grades;
    
    public Student(String studentId, String name, String address, String phone) {
        super(studentId, name, address, phone);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
        this.attendance = new HashMap<>();
        this.grades = new HashMap<>();
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void registerCourse(Course course) {
        courses.add(course);
    }
    
    public void markAttendance(Course course, Date date) {
        List<Date> courseAttendance = attendance.getOrDefault(course, new ArrayList<Date>());
        courseAttendance.add(date);
        attendance.put(course, courseAttendance);
    }
    
    public void submitGrades(Course course, List<Integer> grades) {
        this.grades.put(course, grades);
    }
    
    public List<Date> getAttendance(Course course) {
        return attendance.getOrDefault(course, new ArrayList<Date>());
    }
    
    public List<Integer> getGrades(Course course) {
        return grades.getOrDefault(course, new ArrayList<Integer>());
    }
    
    public List<Course> getCourses() {
        return courses;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
}
