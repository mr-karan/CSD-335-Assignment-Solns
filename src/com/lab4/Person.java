package com.lab4;

/**
 * Created by karan on 28/10/15.
 */
public class Person {
    String name;
    String address;
    String email;
    String phone;

    public Person(){
        name = "John Doe";
        address = "221/C Town Hall Street";
        phone = "9841321949";
        email = "johndoe@abcxyz.com";
    }

    public void setPerson(String name,String address,String email,String phone){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
    public String toString() {
        return "Name: '" + name + "Class : "+this.getClass().getSimpleName();

    }

}
