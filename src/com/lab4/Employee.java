package com.lab4;

import java.util.Date;

/**
 * Created by karan on 28/10/15.
 */
public class Employee extends Person {
    int salary;
    public MyDate datehired = new MyDate();
    String office;
    public Employee() {
        salary=100;
        datehired.year=2015;
        datehired.month=12;
        datehired.day=10;
    }

    public void setEmployee(int s,String o,int year,int month,int day){
        this.salary=s;
        this.office=o;
        this.datehired.year=year;
        this.datehired.month=month;
        this.datehired.day=day;
    }
    public String toString() {
        return "Name: '" + name + "Class : "+this.getClass().getSimpleName();

    }

}
