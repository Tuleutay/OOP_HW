package org.example.HW06.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Study_Group_Service implements ActionForGroup{

    private Random rnd;
    private String firstName;
    private String secondName;
    private List<Student> students;

    @Override
    public Teacher initTeacher(int id){
        rnd = new Random();
        Names name = new Names();
        firstName = name.getFirstName()[rnd.nextInt(0, name.getFirstName().length)];
        secondName = name.getSecondName()[rnd.nextInt(0, name.getSecondName().length)];
        Teacher teacher = new Teacher(id, firstName, secondName);
        return teacher;
    }
    @Override
    public List<Student> initStudents(int id){
        rnd = new Random();
        Names name = new Names();
        students = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            firstName = name.getFirstName()[rnd.nextInt(0, name.getFirstName().length)];
            secondName = name.getSecondName()[rnd.nextInt(0, name.getSecondName().length)];
            students.add(new Student(id, firstName, secondName));
        }
        return students;
    }
}
