package com.tsystems.efimova.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="client")
public class ClientEntity {

    @Id
    @Column(name = "clid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clid;

    @Column(name = "clname", nullable = false, length = 50)
    private String clname;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "birthdate", nullable = false)
    private Date birthdate;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "staff", nullable = false)
    private boolean staff;

    public ClientEntity() {}

    public ClientEntity(String clname, String surname, Date birthdate, String email, String password, boolean staff) {
        this.clname = clname;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
        this.password = password;
        this.staff = staff;
    }

    public long getClid() {
        return clid;
    }

    public void setClid(long clid) {
        this.clid = clid;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }
}
