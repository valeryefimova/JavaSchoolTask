package com.tsystems.efimova.entities;

import javax.persistence.*;

@Entity
@Table(name="clientadress")
public class ClientAdressEntity {

    @Id
    @Column(name = "aid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aid;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "postcode", nullable = false, length = 50)
    private String postcode;

    @Column(name = "street", nullable = false, length = 50)
    private String street;

    @Column(name = "house", nullable = false)
    private int house;

    @Column(name = "flat", nullable = false)
    private int fleat;

    public ClientAdressEntity(String country, String city, String postcode, String street, int house, int fleat) {
        this.country = country;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.house = house;
        this.fleat = fleat;
    }

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFleat() {
        return fleat;
    }

    public void setFleat(int fleat) {
        this.fleat = fleat;
    }
}
