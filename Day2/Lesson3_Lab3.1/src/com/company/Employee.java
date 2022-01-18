package com.company;

import java.time.LocalDate;

public class Employee {
    Position position;
    String employeeID;
    String firstName;
    String middleInitial;
    String lastName;
    LocalDate birthDate;
    String SSN;
    double salary;

    public Employee(String employeeID,String firstName,String middleInitial,String lastName,String SSN, LocalDate birthDate,double salary){
        this.employeeID=employeeID;
        this.firstName=firstName;
        this.middleInitial=middleInitial;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.SSN=SSN;
        this.salary=salary;
    }



    public void print(){
        System.out.println("EmployeeID: " +employeeID);
        System.out.println("FirstName: " +firstName);
        System.out.println("LastName: " +lastName);
        //System.out.println("MiddleInitial: " +middleInitial);
        //System.out.println("BirthDay: " + birthDate);
        //System.out.println("SSN: " +SSN);
        //System.out.println("Salary " + salary);
    }

    public double getSalary(){
        return salary;
    }

}
