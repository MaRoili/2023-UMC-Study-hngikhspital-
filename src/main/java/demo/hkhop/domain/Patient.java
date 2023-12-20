package demo.hkhop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "PATIENT_ID")
    private Long id;
    private String username;
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender;

    @OneToMany(mappedBy = "patient")
    private List<Reservation> reservationList = new ArrayList<>();

    @OneToMany(mappedBy = "patient")
    private List<Treatment> treatmentList = new ArrayList<>();

    public Patient() {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
