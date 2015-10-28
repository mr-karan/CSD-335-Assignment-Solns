package com.lab3;

/**
 * Created by karan on 28/10/15.
 */
public class name {
    String firstName;
    String middleName;
    String lastName;
    String finalName;

    public name(String f, String m, String l) {
        this.firstName = f;
        this.middleName = m;
        this.lastName = l;
        this.finalName = f + m + l;
    }

    public String getName() {
        return this.finalName;
    }

    public void sameNames(String first, String second) {
        if (first.toLowerCase().equals(second.toLowerCase())) {
            System.out.println("Yeah");
        } else {
            System.out.println("Nah");
        }
    }

    public void sameInitals(String first, String second) {
        if (first.charAt(0) == second.charAt(0)) {
            System.out.println("Yeah");
        } else {
            System.out.println("Nah");
        }
    }
    //TODO : Logic Complete


}
