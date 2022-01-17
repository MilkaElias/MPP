package com.company;

public class Person {
    private String name;
    private String phone;
    private int age;

    public Person(String name,String phone,int age){
        this.name=name;
        this.phone=phone;
        this.age=age;
    }

    public Person(String name, String phone, int age, double salary) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        salary = getSalary();
    }


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
    public double getSalary() {
        return 0;
    }



}
