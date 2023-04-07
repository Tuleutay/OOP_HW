package org.example.WH05.viev;

import org.example.WH05.model.School;
import org.example.WH05.model.Study_Group;

public class Output {
    public void all(School school){
        for (Study_Group o: school.getSchool()) {
            System.out.println(o.getTeacher().toString());
            for (int i = 0; i < o.getStudents().size(); i++) {
                System.out.println(o.getStudents().get(i).toString());
            }
        }
    }
    public void allTeacher(School school){
        for (Study_Group o: school.getSchool()) {
            System.out.println(o.getTeacher().toString());
        }
    }
    public void allStudents(School school){
        for (Study_Group o: school.getSchool()) {
            for (int i = 0; i < o.getStudents().size(); i++) {
                System.out.println(o.getStudents().get(i).toString());
            }
        }
    }
    public void teacher(School school , int id_grope){
        System.out.println(school.getSchool().get(id_grope).getTeacher().toString());
    }
    public void studentsOfGrope(School school, int id_grope){
        for (int i = 0; i < school.getSchool().get(id_grope).getStudents().size(); i++) {
            System.out.println(school.getSchool().get(id_grope).getStudents().get(i));
        }
    }


}