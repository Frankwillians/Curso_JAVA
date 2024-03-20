package entities;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date Birthdate;

    public Client(){ }
   

    public Client(String name, String email, Date birthdate) {
        this.name = name;
        this.email = email;
        Birthdate = birthdate;
    }

    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Date getBirthdate() {
        return Birthdate;
    }


    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }
}
