package org.example.HW06.viev;

import org.example.HW06.model.School;
import org.example.HW06.model.Study_Group;
import org.example.HW06.model.Student;
import org.example.HW06.model.Teacher;


public class Output implements OutputService {
    @Override
    public void all(School school) {
        for (Study_Group o : school.getSchool()) {
            System.out.println(o.getTeacher().toString());
            for (int i = 0; i < o.getStudents().size(); i++) {
                System.out.println(o.getStudents().get(i).toString());
            }
        }
    }

    @Override
    public void allTeacher(School school) {
        for (Study_Group o : school.getSchool()) {
            System.out.println(o.getTeacher().toString());
        }
    }

    @Override
    public void allStudents(School school) {
        for (Study_Group o : school.getSchool()) {
            for (int i = 0; i < o.getStudents().size(); i++) {
                System.out.println(o.getStudents().get(i).toString());
            }
        }
    }

    @Override
    public void teacher(School school, int id_grope) {
        System.out.println(school.getSchool().get(id_grope).getTeacher().toString());
    }

    @Override
    public void studentsOfGrope(School school, int id_grope) {
        for (int i = 0; i < school.getSchool().get(id_grope).getStudents().size(); i++) {
            System.out.println(school.getSchool().get(id_grope).getStudents().get(i));
        }
    }


}

