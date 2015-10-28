package com.lab4;

/**
 * Created by karan on 28/10/15.
 */
public class Faculty extends Employee {
    int officeHours;
    int rank;

    public Faculty(){
        officeHours=10;
        rank=20;
    }
    public void setFaculty(int o,int r){
        this.officeHours=o;
        this.rank=r;

    }
    public String toString() {
        return "Name: '" + this.name + "Class : "+this.getClass().getSimpleName();

    }
}
