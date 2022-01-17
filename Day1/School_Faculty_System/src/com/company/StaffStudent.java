package com.company;

import java.time.LocalDate;
import java.util.List;

public class StaffStudent extends Student{
    private LocalDate firstDay;
    private Staff staff=new Staff(null,null,0,0);

    public StaffStudent(String name, String phone, int age, double gpa, int year, int month, int day) {
        super(name, phone, age,gpa);
        firstDay=LocalDate.of(year,month,day);

    }

    public StaffStudent(String name, String phone, int age, double gpa,double salary) {
        super(name, phone, age,gpa);
        staff.setSalary(salary);

    }


    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setSalary(double salary) {
        staff.setSalary(salary);
    }

    public double getSalary() {
        return staff.getSalary();
    }


}
