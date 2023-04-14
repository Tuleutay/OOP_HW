package org.example.HW07.controller;

import org.example.HW07.logger.Logger;
import org.example.HW07.model.*;
import org.example.HW07.view.Out;
public class Controller implements Control{
    private double aF;
    private double iF;
    private double aS;
    private double iS;
    private Complex_Numb numberA;
    private Complex_Numb numberB;
    private double[] temp;

    @Override
    public void program() {
        Getter getter = new Getter();
        GetSign sign = new GetSign();
        Out out = new Out();
        Adder adder = new Adder();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Logger logger = new Logger();
        boolean end = true;
        while (end) {
            aF = getter.number("Введите вещественную часть первого комплексного числа: ");
            iF = getter.number("Введите мнимую часть первого комплексного числа: ");
            aS = getter.number("Введите вещественную часть второго комплексного числа: ");
            iS = getter.number("Введите мнимую часть второго комплексного числа: ");
            numberA = new Complex_Numb(aF, iF);
            numberB = new Complex_Numb(aS, iS);
            logger.update(numberA, "Первое число: ");
            logger.update(numberB, "Второе число: ");

            switch (sign.getSign("Введите математическую операцию: '+' , '-' , '*', '/'")){
                case "+" -> {
                    temp = adder.operate(numberA, numberB);
                    out.print(new Complex_Numb(temp[0], temp[1]));
                }
                case "-" -> {
                    temp = subtraction.operate(numberA, numberB);
                    out.print(new Complex_Numb(temp[0], temp[1]));
                }
                case "*" -> {
                    temp = multiplication.operate(numberA, numberB);
                    out.print(new Complex_Numb(temp[0], temp[1]));
                }
                case "/" -> {
                    temp = division.operate(numberA, numberB);
                    out.print(new Complex_Numb(temp[0], temp[1]));
                }

            }
            switch (sign.getSign("Продолжить работу программы: Y/N")){
                case "Y" -> {
                }
                case "N" -> {
                    end = false;
                }
            }
        }

    }
}
