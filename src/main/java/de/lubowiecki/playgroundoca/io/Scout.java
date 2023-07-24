package de.lubowiecki.playgroundoca.io;

import java.io.Serializable;
import java.time.LocalDate;

public class Scout implements Serializable {

    private String firstname;

    private String lastname;

    private LocalDate birthdate;

    public Scout() {
    }

    public Scout(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
