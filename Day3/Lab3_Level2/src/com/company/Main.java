package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<ACarrier> carriers;
    public Main(){
        carriers=new ArrayList();
    }
    //getters and setters
    public static List<ACarrier> getCarriers() {
        return carriers;
    }
    public static void setCarriers(List<ACarrier> carriers) {
        Main.carriers = carriers;
    }
    public static void getLeastPrices(List<Package> packages) {
        for(Package p : packages) {
            double leastPrice = getCarriers().get(0).getPrice(p);
            String leastCarrier=getCarriers().get(0).getClass().getSimpleName();
            for(ACarrier c : getCarriers()) {
                double currentPrice = c.getPrice(p);
                String currentCarrier = c.getClass().getSimpleName();
                if(currentPrice < leastPrice) {
                    leastPrice = currentPrice;
                    leastCarrier = currentCarrier;
                }
            }
            String specificCustomer=p.getCustomer().getClass().getSimpleName();
            String f = "%s	$%,.2f	%s%n";
            System.out.printf(f, p.getDescription(), leastPrice, leastCarrier + " for "+ specificCustomer);
        }
    }

    public static void main(String[] args) {
        List<ACarrier> listOfCarriers = new ArrayList();
        listOfCarriers.add(new UPS());
        listOfCarriers.add(new USMail());
        listOfCarriers.add(new FedEx());

        setCarriers(listOfCarriers);

        Package book = new Package("Book", 2.0, "IA", new SeniorCustomer());
        Package book2 = new Package("Book", 2.0, "IA", new RegularCustomer());
        Package book3 = new Package("Book", 2.0, "IA", new Student());

        Package phone = new Package("Phone", 4.0, "MA", new SeniorCustomer());
        Package boots = new Package("Boots", 6.0, "NY",new SeniorCustomer());

        List<Package> packageList = new ArrayList<>();
        packageList.add(book);
        packageList.add(book2);
        packageList.add(book3);

        packageList.add(phone);
        packageList.add(boots);

        getLeastPrices(packageList);
    }
}
