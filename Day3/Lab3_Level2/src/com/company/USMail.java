package com.company;

public class USMail extends ACarrier{
    public USMail(){
        super();
    }

    @Override
    public double getPrice(Package p) {
        double discount =p.getCustomer().getDiscount();
        if (p.getWeight()<3) return 1*discount;
        return 0.55*p.getWeight()*discount;
    }

}
