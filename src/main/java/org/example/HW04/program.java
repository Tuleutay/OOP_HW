package org.example.HW04;

import java.util.ArrayList;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.sum(new ArrayList<>(Arrays.asList(3.5, 6.4, 3.7))));
        System.out.printf("%.3f", calc.div(new ArrayList<>(Arrays.asList(1.0, 0.007f, 5.7))));
        System.out.println();
        System.out.println(calc.mult(new ArrayList<>(Arrays.asList(1.9, 2.7, 5.7))));


    }
}
