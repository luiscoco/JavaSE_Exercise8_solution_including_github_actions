package com.example;

import java.util.*;

public class Faculty {
    private String name;
    private List<Department> departments;
    
    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    public List<Department> getDepartments() {
        return departments;
    }
    
    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}
