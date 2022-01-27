package com.company;

import java.time.Duration;

public class Salaried extends Employee{

    private double salary;

    public Salaried(String empID, double salary){
        super(empID);
        this.salary=salary;
    }
    public double calcGrossPay(DateRange dateRange){
        //long numOfMonth= (Duration.between(dateRange.getEndDate(), dateRange.getStartDate()).toDays())/30; //Assuming that every month has 30 days
        //double grossPay= salary*numOfMonth;
        //return grossPay;
        return salary;
    }

}
