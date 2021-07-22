package com.example.restservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String birthdate;
    private String country;
    private String phone;
    private String gender;

    public User() {}

    public User(String name, String birthdate, String country) {
        this.name = name;
        this.birthdate = birthdate;
        this.country = country;
    }

    public User(String name, String birthdate, String country, String phone, String gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.country = country;
        this.phone = phone;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
            "User[id=%d, name='%s', birthdate='%s', country='%s']",
            id, name, birthdate, country
        );
    }
}