package org.example.HW07.controller;

import java.util.Scanner;

public class Getter implements Get{
    Scanner in;
    @Override
    public double number(String message) {
        Integer temp = 0;
        in = new Scanner(System.in);
        String a;
        while (true){
            System.out.println(message);
            a = in.next();
            try {
                temp = Integer.parseInt(a);
                break;
            } catch (NumberFormatException e){
                System.out.println("Вы ввели неверный тип данных");
            }
        }
        double result = temp.doubleValue();
        return result;
    }
}
