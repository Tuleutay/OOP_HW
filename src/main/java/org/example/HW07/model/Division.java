package org.example.HW07.model;

public class Division implements Operate{
    @Override
    public double[] operate(Complex_Numb a, Complex_Numb b) {
        double[] temp = new double[2];
        double q = a.getA()* b.getA() - a.getI()*b.getI()*(-1) ;
        double w = b.getA() * a.getI() - a.getA() * b.getI();
        double z = Math.pow(b.getA(), 2) - Math.pow(b.getI(), 2) * (-1);
        temp[0] = q / z;
        temp[1] = w / z;
        return temp;
    }
}
