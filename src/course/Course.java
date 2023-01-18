package course;

import group.Group;

import java.util.Arrays;

public class Course {
    private String name;
    private int number;
    private String surnameisateacher;
    private Group [] groups;



    public Course(String name, int number, String surnameisateacher, Group[] groups) {
        this.name = name;
        this.number = number;
        this.surnameisateacher = surnameisateacher;
        this.groups = groups;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSurnameisateacher() {
        return surnameisateacher;
    }

    public void setSurnameisateacher(String surnameisateacher) {
        this.surnameisateacher = surnameisateacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course = " +
                "name:" + name +
                ", number:" + number +
                ", surnameisateacher:" + surnameisateacher  +
                ", groups:" + Arrays.toString(groups) ;
    }
}


