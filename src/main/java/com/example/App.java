package com.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Initialize University
        University university = new University("ABC University", "123 University Street");

        // Initialize Faculties
        Faculty faculty1 = new Faculty("Faculty of Science");
        Faculty faculty2 = new Faculty("Faculty of Arts");

        // Initialize Departments
        Department department1 = new Department("Department of Mathematics");
        Department department2 = new Department("Department of Physics");

        // Initialize Courses
        Course course1 = new Course("MATH101", "Calculus");
        Course course2 = new Course("PHYS101", "Physics I");

        // Initialize Students
        Student student1 = new Student("S001", "John Doe", "123 Student Street", "123-456-7890");
        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student1.markAttendance(course1, new Date());
        student1.submitGrades(course1, Arrays.asList(85, 90, 92));

        Student student2 = new Student("S002", "Jane Smith", "456 Student Street", "987-654-3210");
        student2.registerCourse(course1);
        student2.markAttendance(course1, new Date());
        student2.submitGrades(course1, Arrays.asList(90, 88, 95));

        // Initialize Teachers
        Teacher teacher1 = new Teacher("T001", "Professor Johnson", "789 Teacher Street", "456-789-0123");
        teacher1.teachCourse(course1);

        Teacher teacher2 = new Teacher("T002", "Professor Davis", "987 Teacher Street", "012-345-6789");
        teacher2.teachCourse(course2);

        // Add departments to faculties
        faculty1.addDepartment(department1);
        faculty2.addDepartment(department2);

        // Add courses to departments
        department1.addCourse(course1);
        department2.addCourse(course2);

        // Add students to university
        university.addStudent(student1);
        university.addStudent(student2);

        // Add teachers to university
        university.addTeacher(teacher1);
        university.addTeacher(teacher2);

        // Add faculties to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Print university information
        System.out.println(university.toString());

        // Print faculties and departments
        List<Faculty> faculties = university.getFaculties();
        for (Faculty faculty : faculties) {
            System.out.println(faculty.toString());
            List<Department> departments = faculty.getDepartments();
            for (Department department : departments) {
                System.out.println("\t" + department.toString());
            }
        }

        // Print students and their courses
        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println(student.toString());
            List<Course> studentCourses = student.getCourses();
            for (Course course : studentCourses) {
                System.out.println("\t" + course.toString());
            }
        }

        // Print teachers and their assigned courses
        List<Teacher> teachers = university.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
            List<Course> assignedCourses = teacher.getAssignedCourses();
            for (Course course : assignedCourses) {
                System.out.println("\t" + course.toString());
            }
        }
    }
}
