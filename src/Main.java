import course.Course;
import group.Group;
import student.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(2002, "Nurisa", "Zharmamat kyzy", "mamatisaevanurisa@gmail.com");
        Student student2 = new Student(2005, "Nazira", "Bakirova", "bakirovanaz@gmail.com");
        Student student3 = new Student(2005,"Zalina","Sultanova", "Zalina@gmail.com");
        System.out.println();
        System.out.println(student);
        System.out.println();

        Group group = new Group("Java", "December", new Student[] {student,student2,student3});
        Group group1 = new Group("Java","November",new Student[]{student,student2,student3});
        System.out.println(group);
        System.out.println();

          Course course = new Course("Backend",5,"Kasymbaev Timurlan", new Group[]{group,group1});
        System.out.println(course);




    }
    }