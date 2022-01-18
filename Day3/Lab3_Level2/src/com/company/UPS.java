package com.company;

public class UPS extends ACarrier{
    public UPS(){
        super();
    }

    @Override
    public double getPrice(Package p) {
        double discount =p.getCustomer().getDiscount();
        return p.getWeight()*0.45*discount;
    }
}
