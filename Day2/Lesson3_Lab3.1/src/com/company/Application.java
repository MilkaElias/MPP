package com.company;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Company company=new Company("ABC");
        Department d1=new Department("CS","47A", company);
        Department d2=new Department("BA","47B", company);
        company.departmentList.add(d1);
        company.departmentList.add(d2);
        Position p1=new Position("CS Manager","Product Manager",d1);
        Position p2=new Position(" BA Professor","Assistant BA Professor",d2);
        Position p3=new Position("CS Professor","Professor",d1);

        d1.listOfPositions.add(p1);
        d1.listOfPositions.add(p3);
        d2.listOfPositions.add(p2);
        Employee e1=new Employee("CS123","Milka","ME","Elias","123-456", LocalDate.now(),12000);
        p1.employeeList.add(e1);
        Employee e3=new Employee("CS456","Bob","BH","Hart","908-456", LocalDate.now(),10000);
        p3.employeeList.add(e3);

        Employee e2=new Employee("BA123","Mike","MA","Arthur","789-456", LocalDate.now(),18000);
        p2.employeeList.add(e2);
        company.print();
        System.out.println("The total salary the company pays for its employees is: "+company.getSalary());
    }
}
