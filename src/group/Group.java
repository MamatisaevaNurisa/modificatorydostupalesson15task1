package group;

import student.Student;

import java.util.Arrays;

public class Group {
    private String learn;
    private String date;
    private Student[] students;

    public Group(String learn, String date,Student[] students) {
        this.learn = learn;
        this.date = date;
        this.students=students;
    }


    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group = " +
                "learn: " + learn  +
                ", date:" + date  +
                ", students:" + Arrays.toString(students) ;
    }
}
