package student;

public class Student {

   private int birthYear;
   private String name;

   private String surname;
   private String gmail;


    public Student(int birthYear, String name, String surname, String gmail) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.gmail = gmail;

        if (birthYear<0) {
            System.out.println("Studenttin tuulgan jyly ters san");
        }else{
            System.out.println("Studenttin tuulgan jyly on san");

     }
 }





    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student = " +
                "birthYear:" + birthYear +
                ", name:" + name +
                ", surname:" + surname  +
                ", gmail:" + gmail ;
    }
}
