package org.example.HW06.model;

import java.util.List;

public class Study_Group<Teacher, Student> {
    private Teacher teacher;
    private List<Student> students;

    public Study_Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }


    public Teacher getTeacher() {
        return this.teacher;
    }

    public List<Student> getStudents() {
        return this.students;
    }


}
