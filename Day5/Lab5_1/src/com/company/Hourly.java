package com.company;

import java.time.Duration;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursPerWeek;


    public Hourly(String empID, double hourlyWage, double hoursPerWeek){
        super(empID);
        this.hourlyWage=hourlyWage;
        this.hoursPerWeek=hoursPerWeek;
    }

    public double calcGrossPay(DateRange dateRange){
        //long numOfWeeks= (Duration.between(dateRange.getEndDate(), dateRange.getStartDate()).toDays())/7;
        //double grossPay=hoursPerWeek*hourlyWage*4; //Since there are 4 weeks per month
        //return hoursPerWeek*hourlyWage*numOfWeeks;
        return hourlyWage*hoursPerWeek*4;
    }



}
