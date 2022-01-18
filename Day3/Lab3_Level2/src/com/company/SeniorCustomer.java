package com.company;

public class SeniorCustomer implements Customer{

    @Override
    public double getDiscount() {
        return 0.85;
    }
}
