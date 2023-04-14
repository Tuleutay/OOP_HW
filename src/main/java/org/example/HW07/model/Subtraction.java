package org.example.HW07.model;

public class Subtraction implements Operate{

    @Override
    public double[] operate(Complex_Numb a, Complex_Numb b) {
        double[] temp = new double[2];
        temp[0] = a.getA() - b.getA();
        temp[1] = a.getI() - b.getI();
        return temp;
    }
}
