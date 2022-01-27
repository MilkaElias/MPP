package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        Employee hourly=new Hourly("Hourly123", 50,40);
        Employee salaried=new Salaried("Salaried123", 12000);
        Commissioned commissioned=new Commissioned("Commissioned1",1000);
        commissioned.addOrder(new Order("order1", LocalDate.of(2021,1,5),1000));
        Commissioned commissioned2=new Commissioned("Commissioned12",3000);
        commissioned2.addOrder(new Order("order2", LocalDate.of(2021,1,8),500));
        commissioned2.addOrder(new Order("order3", LocalDate.of(2021,2,15),800));

        employeeList.add(hourly);
        employeeList.add(salaried);
        employeeList.add(commissioned);
        employeeList.add(commissioned2);


        PayCheck hourly_January_2021=hourly.calcCompensation(1,2021);
        PayCheck salaried_January_2021=salaried.calcCompensation(1,2021);
        PayCheck commissioned_January_2021=commissioned.calcCompensation(1,2021);
        PayCheck commissioned2_January_2021=commissioned2.calcCompensation(1,2021);


        PayCheck hourly_February_2021=hourly.calcCompensation(2,2021);
        PayCheck salaried_February_2021=salaried.calcCompensation(2,2021);
        PayCheck commissioned_February_2021=commissioned.calcCompensation(2,2021);
        PayCheck commissioned2_February_2021=commissioned2.calcCompensation(1,2021);

        hourly.addPayCheck(hourly_January_2021);
        hourly.addPayCheck(hourly_February_2021);

        salaried.addPayCheck(salaried_January_2021);
        salaried.addPayCheck(salaried_February_2021);

        commissioned.addPayCheck(commissioned_January_2021);
        commissioned.addPayCheck(commissioned_February_2021);

        commissioned2.addPayCheck(commissioned2_January_2021);
        commissioned2.addPayCheck(commissioned2_February_2021);

        for(Employee e:employeeList){
            e.print();
        }
    }
}
