package com.company;

public class RegularCustomer implements Customer{
    @Override
    public double getDiscount() {
        return 1;
    }
}
