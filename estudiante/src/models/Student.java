package models;

public class Student {
    //Atributos
    private String firstname;
    private String lastname;
    private String major;
    private float average;

    //Métodos - Constructor
    public Student() {
    }

    public Student(String firstname, String lastname, String major, float average) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.average = average;
    }

    // getter y setter

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", major='" + major + '\'' +
                ", average=" + average +
                '}';
    }
}
