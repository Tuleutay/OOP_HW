package org.example.HW06.model;

import java.util.ArrayList;
import java.util.List;

public class School implements ActionForSchool{
    private List<Study_Group> school;

    @Override
    public List<Study_Group> initSchool(int numbs){
        school = new ArrayList<>();
        Study_Group_Service group = new Study_Group_Service();
        for (int i = 1; i < numbs + 1; i++) {
            school.add(new Study_Group(group.initTeacher(i), group.initStudents(i)));
        }
        return school;
    }

    public List<Study_Group> getSchool() {
        return school;
    }
}
