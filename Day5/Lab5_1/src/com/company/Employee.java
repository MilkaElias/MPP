package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    String empId;
    List<PayCheck> payCheckList;

    public Employee(String empId){
        this.empId=empId;
        payCheckList=new ArrayList<>();
    }

    public void addPayCheck(PayCheck payCheck){
        payCheckList.add(payCheck);
    }

    public abstract double calcGrossPay(DateRange dateRange);

    public PayCheck calcCompensation(int month, int year){
        LocalDate startDayOfMonth=LocalDate.of(year,month,1); //find the first day of the month
        LocalDate endDayOfMonth=LocalDate.of(year,month, startDayOfMonth.lengthOfMonth());
        DateRange date=new DateRange(startDayOfMonth,endDayOfMonth);
        payCheckList.add(new PayCheck(this,date,this.calcGrossPay(date)));
        return new PayCheck(this,date,this.calcGrossPay(date));
    }

    public void print(){
        for(PayCheck pc : payCheckList) {
            pc.print();
            System.out.println();
        }
    }

}


