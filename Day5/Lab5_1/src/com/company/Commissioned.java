package com.company;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private List<Order> orderList;
    private static double commission=0.07;
    private double baseSalary;

    public Commissioned(String empID, double baseSalary){
        super(empID);
        this.baseSalary=baseSalary;
        orderList=new ArrayList<>();
    }

    public double getCommission(){
        return commission;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    public double calcGrossPay(DateRange dateRange){
        double grossPay = 0;
        for(Order o : orderList) {
            if(dateRange.isInRange(o.getOrderDate())){
                grossPay += o.getOrderAmount() * commission;
            }
        }
        return grossPay+baseSalary;

    }


}
