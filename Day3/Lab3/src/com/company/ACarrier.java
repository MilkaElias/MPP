package com.company;

public abstract class ACarrier implements ICarrier{
    double weight;

    public ACarrier(){
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double getPrice(Package p);

}
