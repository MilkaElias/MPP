package com.company;
import java.util.ArrayList;
import java.util.List;

public class Department {
    Company company;
    String name;
    String location;
    List<Position> listOfPositions;

    public Department(String name, String location, Company company){
        this.name=name;
        this.location=location;
        this.company=company;
        listOfPositions=new ArrayList(3);
    }

    public void print(){
        System.out.println("DepartmentName: "+ name);
        System.out.println();
        for(Position p:listOfPositions){
            p.print();
        }
    }

    public double getSalary(){
        int departmentSalary=0;
        for(Position p:listOfPositions){
            departmentSalary+=p.getSalary();
        }
        return departmentSalary;
    }


    @Override
    public String toString(){
        return "DepartmentName: " + name + "\n"+ "Location: "+location;
    }

}
