package org.example.WH05.model;

public class Teacher extends User{
    String status = Status.TEACHER.toString();

    public Teacher(int id_group, String firstName, String secondName) {
        super(id_group, firstName, secondName);
    }

    @Override
    public String toString() {
        return String.format("Номер группы: %d; Имя: %s; Фамилия: %s; Категория: %s", this.id_group, this.firstName,
                this.secondName, this.status);
    }

    @Override
    public int getId_group() {
        return super.id_group;
    }


}
