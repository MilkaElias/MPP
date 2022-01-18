package com.company;

public class Student implements Customer{
    @Override
    public double getDiscount() {
        return 0.9;
    }
}
