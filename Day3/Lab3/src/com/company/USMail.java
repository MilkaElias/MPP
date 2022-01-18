package com.company;

public class USMail extends ACarrier {
    public USMail(){
        super();
    }

    @Override
    public double getPrice(Package p) {
        if (p.getWeight()<3) return 1;
        return 0.55*p.getWeight();
    }


}
