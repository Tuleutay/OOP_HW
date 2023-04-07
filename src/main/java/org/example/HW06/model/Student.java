package org.example.HW06.model;

public class Student extends User{

    private String status = Status.STUDENT.toString();
    public Student(int id_group, String firstName, String secondName) {
        super(id_group, firstName, secondName);
    }

    @Override
    public String toString() {
        return String.format("Номер группы: %d; Имя: %s; Фамилия: %s; Категория: %s", this.id_group, this.firstName,
                this.secondName, this.status);
    }

    @Override
    public int getId_group() {
        return id_group;
    }
}