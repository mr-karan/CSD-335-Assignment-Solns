package com.SNU.geometryUtil.SNU.shapes;

import com.SNU.geometryUtil.*;
import com.lab3.name;
import com.lab4.Employee;
import com.lab4.Faculty;
import com.lab4.Person;
import com.lab4.dynamicBinding.FirstD;
import com.lab4.dynamicBinding.SecondD;
import com.lab4.dynamicBinding.ThirdD;


/**
 * Created by karan on 28/10/15.
 */
public class admin {
    public static void main(String[] args) {
        circle C = new circle(4.5);
        rectangle R =new rectangle(7,8);
        square S = new square(5);

        System.out.println("Perimter of the shapes");
        double pofc = C.getPerimeter();
        double pofr = R.getPerimeter();
        double pofs = S.getPerimeter();
        //double poft = T.getPerimeter();
        System.out.println(pofc);
        System.out.println(pofr);
        System.out.println(pofs);
       // System.out.println(poft);

        name N = new name("Karan", "Sharma", "Ram");
        name X = new name("Karan", "singh", "ram");
        String nname = N.getName();
        String xname = X.getName();
        N.sameNames(nname, xname);
        N.sameInitals(nname, xname);

        Person p = new Person();
        Faculty f = new Faculty();
        Employee e = new Employee();
        e.setPerson("Karan", "HNOXXX", "a@a.com", "9658446523215");
        System.out.println(p.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());

        FirstD o1 = new FirstD();
        o1.locateClass();
        System.out.println();
        SecondD o2 = new SecondD();
        o2.locateClass();
        System.out.println();
        ThirdD o3 = new ThirdD();
        o3.locateClass();

    }
}
