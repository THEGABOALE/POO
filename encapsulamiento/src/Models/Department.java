package Models;

import  java.util.ArrayList;

public class Department{
    private String name;
    private Teacher teacher;

    public Department(String name, ArrayList<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }
}



