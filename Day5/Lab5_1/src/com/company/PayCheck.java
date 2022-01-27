package com.company;


public class PayCheck {
    private static double fica=0.23;
    private double grossPay;
    private static double state=0.05;
    private static double local=0.01;
    private static double medicare=0.03;
    private static double socialSecurity=0.075;
    private DateRange payPeriod;
    private Employee employee;

    public PayCheck(Employee employee,DateRange payPeriod,double grossPay){
        this.employee=employee;
        this.payPeriod=payPeriod;
        this.grossPay = employee.calcGrossPay(this.payPeriod);

    }

    //Getters
    public double getFica() {
        return fica;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public DateRange getPayPeriod() {
        return payPeriod;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getState() {
        return state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getNetPay(){
        double sumOfTaxes=getFica()+getLocal()+getMedicare()+getState()+getSocialSecurity();
        double netPay=getGrossPay()-(getGrossPay()*sumOfTaxes);
        return netPay;
    }
    public void print(){
        System.out.println("Paycheck for Employee ID: "+employee.empId +" for the payperiod: " + payPeriod );
        System.out.println("Grosspay: "+ this.getGrossPay());
        System.out.println("Netpay: "+ this.getNetPay());

        System.out.println("Fica: "+ getFica());
        System.out.println("State Tax: "+ getState());
        System.out.println("Social Security: "+ getSocialSecurity());
        System.out.println("Local Tax: "+ getLocal());
        System.out.println("Medicare: "+ getMedicare());

    }

}
