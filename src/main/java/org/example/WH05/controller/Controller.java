package org.example.WH05.controller;

import org.example.WH05.model.School;
import org.example.WH05.viev.Output;

import java.util.Scanner;

public class Controller {
    private static Scanner in;

    public static void startProgram() {
        int gropes = getNumb("Введите количество групп:");
        Output out = new Output();
        School school = new School();
        school.initSchool(gropes);
        while (true) {
            int toDo = getNumb(
                    "Выберете один из вариантов:\n" +
                            "1 - показать полную информацию о группах\n" +
                            "2 - показать всех учителей\n" +
                            "3 - показать всех учащихся\n" +
                            "4 - показать преподавателя выбранной группы\n" +
                            "5 - показать учеников выбранной группы\n" +
                            "6 - выйти из программы");
            switch (toDo) {
                case 1 -> out.all(school);
                case 2 -> out.allTeacher(school);
                case 3 -> out.allStudents(school);
                case 4 -> {
                    int a = getNumb("Выберите номер группы") - 1;
                    if (a >= 0 && a < gropes) {
                        out.teacher(school, a);
                    } else {
                        System.out.println("Вы указали неверный номер группы");
                    }
                }
                case 5 -> {
                    int a = getNumb("Выберите номер группы") - 1;
                    if (a >= 0 && a < gropes) {
                        out.studentsOfGrope(school, a);
                    } else {
                        System.out.println("Вы указали неверный номер группы");
                    }
                }
                case 6 -> {
                    return;
                }
            }


        }
    }

    private static int getNumb(String message) {
        in = new Scanner(System.in);
        int result = 0;
        while (result <= 0) {
            System.out.println(message);
            if (in.hasNextInt()) {
                result = in.nextInt();
            } else {
                System.out.println("Введите целое положительное число");
            }
        }

        return result;
    }
}
