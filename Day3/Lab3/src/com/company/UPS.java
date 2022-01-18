package com.company;

public class UPS extends ACarrier{
    public UPS(){
        super();
    }

    @Override
    public double getPrice(Package p) {
        return p.getWeight()*0.45;
    }
}
