package Models;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    private String name;
    private String lastname;
    private String email;



    /*public void setLastname(String lastname){
        if (lastname == null){
            System.out.println("lastname is NULL");
            return;
        }

        this.lastname = lastname.toUpperCase().trim();
    }

    public String getLastname() {
        return lastname;
    }

    public Student() {

    }

    public Student(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }*/
}
