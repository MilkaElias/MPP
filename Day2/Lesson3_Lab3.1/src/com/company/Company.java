package com.company;
import java.util.ArrayList;
import java.util.List;

public class Company {
    List <Department> departmentList;
    String name;

    public Company(String name){
        this.name=name;
        departmentList=new ArrayList();

    }

    public void print(){
        System.out.println("CompanyName: "+ name +" has " + departmentList.size() +" departments.");
        System.out.println();
        for(Department d:departmentList){
            System.out.println("##########################");
            d.print();

        }
    }

    public double getSalary(){
        int companySalary=0;
        for(Department d:departmentList){
            companySalary+=d.getSalary();
        }
        return companySalary;
    }

}
