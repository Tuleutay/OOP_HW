package org.example.HW06.model;

import java.util.List;

public interface ActionForGroup {
    Teacher initTeacher(int id);

    List<Student> initStudents(int id);


}