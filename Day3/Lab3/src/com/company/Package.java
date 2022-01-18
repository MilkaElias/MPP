package com.company;

public class Package {
    private ICarrier carrier;
    private String description;
    private double weight;
    private String zone;

    public Package(String description, double weight,String zone){
        this.description=description;
        this.weight=weight;
        this.zone=zone;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }



}
