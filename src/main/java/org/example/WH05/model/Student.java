package org.example.WH05.model;

public class Student extends User{
    String status = Status.STUDENT.toString();
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
        return 0;
    }

    int getGroupID(){
        return id_group;
    }
}
