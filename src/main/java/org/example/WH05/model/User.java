package org.example.WH05.model;
import java.util.Objects;

public abstract class User {
    protected int id_group;
    protected String firstName;
    protected String secondName;


    public User(int id_group, String firstName, String secondName) {
        this.id_group = id_group;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public abstract String toString();

    public abstract int getId_group();

}