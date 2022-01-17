package com.company;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Person> persons;

    public Department(String name){
        this.name=name;
        persons=new ArrayList<>();
    }
    public void addPerson(Person p){
        persons.add(p);
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void unitsPerFaculty(){
        int units=0;
        for(Person p:persons){
            if(!(p instanceof Faculty)) continue;
            else{
                Faculty f = (Faculty) p;
                units=f.getTotalUnits();
            }
            System.out.println("Faculty Name: "+ ((Faculty)p).getName() + ", Units: "+ units);
        }
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for(Person p : persons) {
            totalSalary += p.getSalary();
        }
        return totalSalary;
    }

    /*
    //public double getTotalSalary() {
    // double totalSalary=0;
        for(Person p:persons){
            if(p instanceof Student) continue;
            if(p instanceof Faculty){
               Faculty f= (Faculty)p;
               totalSalary+=f.getSalary();
            }
            if(p instanceof Staff){
               Staff s = (Staff)p;
                totalSalary+=s.getSalary();
            }
            if(p instanceof StaffStudent){
                StaffStudent ss = (StaffStudent)p;
                totalSalary+=ss.getSalary();
            }
        }
        return totalSalary;
    }
    */

    public void showAllMembers(){
        for(Person p:persons){
            System.out.println("Name: "+ p.getName() +", Age: "+ p.getAge() +", Type: " + p.getClass().getSimpleName());
        }
    }

}
