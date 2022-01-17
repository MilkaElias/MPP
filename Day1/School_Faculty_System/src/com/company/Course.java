package com.company;

public class Course {
    private String number;
    private String title;
    private int units;
    Person facultyName;

    public Course(String number, String title, int units, Person facultyName){
        this.number=number;
        this.title=title;
        this.units=units;
        this.facultyName=facultyName;
        //faculty.setName(facultyName);
    }

    public String getNumber() {
        return number;
    }

    public int getUnits() {
        return units;
    }
    public String getTitle(){
        return title;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
