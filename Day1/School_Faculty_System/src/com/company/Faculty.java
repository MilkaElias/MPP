package com.company;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private double salary;
    private List<Course> courses;

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        courses=new ArrayList<>();

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addCourse(Course courseName){
        courses.add(courseName);
        //frankMoore.addCourse(cs450); where cs450 is a course
    }
    public int getTotalUnits() {
        int totalUnits = 0;
        for (Course c : courses) {
            totalUnits +=c.getUnits();
        }
        return totalUnits;
    }
}
