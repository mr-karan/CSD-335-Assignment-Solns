package com.SNU.geometryUtil.SNU.shapes;

import com.SNU.geometryUtil.circle;
import com.SNU.geometryUtil.rectangle;
import com.SNU.geometryUtil.square;
import com.SNU.geometryUtil.triangle;
import com.lab3.name;


/**
 * Created by karan on 28/10/15.
 */
public class admin {
    public static void main(String[] args) {
        circle C = new circle(4.5);
        triangle T = new triangle(4,5,6);
        rectangle R =new rectangle(7,8);
        square S = new square(5);

        System.out.println("Perimter of the shapes");
        double pofc = C.getPerimeter();
        double pofr = R.getPerimeter();
        double pofs = S.getPerimeter();
        double poft = T.getPerimeter();
        System.out.println(pofc);
        System.out.println(pofr);
        System.out.println(pofs);
        System.out.println(poft);

        name N = new name("Karan", "Sharma", "Ram");
        name X = new name("Karan", "singh", "ram");
        String nname = N.getName();
        String xname = X.getName();
        N.sameNames(nname, xname);
        N.sameInitals(nname, xname);

    }
}
