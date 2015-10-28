package com.lab4;

/**
 * Created by karan on 28/10/15.
 */
public class Staff extends Employee {
    String title;

    public Staff(){
        title="LazyA$$";
    }
    public void setStaff(String title){
        this.title=title;
    }
    public String toString() {
        return "Name: '" + this.name + "Class : "+this.getClass().getSimpleName();

    }
    }
