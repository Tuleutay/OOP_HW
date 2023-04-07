package org.example.HW06.viev;

import org.example.HW06.model.School;

public interface OutputService {
    void all(School school);
    void allTeacher(School school);
    void allStudents(School school);
    void teacher(School school , int id_grope);
    void studentsOfGrope(School school, int id_grope);
}
