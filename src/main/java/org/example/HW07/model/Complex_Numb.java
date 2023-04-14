package org.example.HW07.model;

public class Complex_Numb {
    private double a;
    private double i;
    private String v;


    public Complex_Numb(double a, double i) {
        this.a = a;
        this.i = i;
    }

    public double getA() {
        return a;
    }

    public double getI() {
        return i;
    }

    public String getV() {
        return v;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setI(double i) {
        this.i = i;
    }

    public void setV(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        String str = "";
        if(i > 0) {
            str = "Complex_Numb{" +
                    a + " + " +  i + "i" + "}";
        }
        if (i == 0){
            str = "Complex_Numb{" + a + "}";
        }
        if (i < 0){
            str = "Complex_Numb{" +
                    a + " " + i + "i" + "}";
        }
        return str;
    }
}
