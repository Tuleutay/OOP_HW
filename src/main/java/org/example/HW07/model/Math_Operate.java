package org.example.HW07.model;

public abstract class Math_Operate {
    protected Complex_Numb y;
    protected Complex_Numb z;

    public Math_Operate(Complex_Numb y, Complex_Numb z) {
        this.y = y;
        this.z = z;
    }
}