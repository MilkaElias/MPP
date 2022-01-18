package com.company;

public class FedEx extends ACarrier{
    double zone;
    public FedEx(){
        super();
    }

    public double getZone() {
        return zone;
    }

    public void setZone(double zone){
        this.zone=zone;
    }

    @Override
    public double getPrice(Package p) {
        double cost=0;
        switch (p.getZone()) {
            case "IA":
            case "MT":
            case "OR":
            case "CA":
                cost = p.getWeight() * 0.35;
                break;
            case "TX":
            case "UT":
                cost = p.getWeight() * 0.30;
                break;
            case "FL":
            case "MA":
            case "OH":
                cost = p.getWeight() * 0.55;
                break;
            default:
                cost = p.getWeight() * 0.43;
        }
        return cost;
    }

}
