package com.lab4;

/**
 * Created by karan on 28/10/15.
 */
public class Student extends Person {
    String status ;

    public Student(){
        status="Freshmen";
    }
    public void setStudent(String s){
        this.status=s;

    }
    public String toString() {
        return "Name: '" + this.name + "Class : "+this.getClass().getSimpleName();

    }
}
