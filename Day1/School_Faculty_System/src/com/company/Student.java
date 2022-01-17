package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private double gpa;
    private List<Course> course;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa=gpa;
    }

    public void addCourse(Course courseName){
        course=new ArrayList<>();
        course.add(courseName);
        //frankMoore.addCourse(cs450); where cs450 is a course
    }

}
