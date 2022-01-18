package com.company;
import java.util.ArrayList;
import java.util.List;

public class Position {
    String title;
    String description;
    List<Employee> employeeList; //A position can contain zero or one employee
    Department department;

    public Position(String title, String description,Department department){
        this.title=title;
        this.description=description;
        this.department=department;
        employeeList=new ArrayList();
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print(){
        System.out.println("PositionName: "+ title);
        for(Employee e:employeeList){
            e.print();
            System.out.println();
        }

    }

    public double getSalary(){
        int employeeSalary=0;
        for(Employee e:employeeList){
            employeeSalary+=e.getSalary();
        }
        return employeeSalary;
    }

}
