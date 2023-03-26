package org.example.HW04;

import java.util.List;

public class Calc{
    public Double sum(List<? extends Number> items) {
        double sum = 0;
        for (Number i : items) {
            sum += i.doubleValue();

        }
        return sum;
    }
    public Double mult(List<? extends Number> items) {
        double mult = 1;
        for (Number i : items) {
            mult *= i.doubleValue();

        }
        return mult;
    }
    public Double div(List<? extends Number> items) {

        double div = Math.pow(items.get(0).doubleValue(),2);
        double f = items.get(1).doubleValue();

        for (Number i : items) {
            div /= i.doubleValue();

        }
        return div;
    }
}



