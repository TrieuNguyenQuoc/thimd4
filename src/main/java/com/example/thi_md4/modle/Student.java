package com.example.thi_md4.modle;

import lombok.Data;
import sun.util.resources.LocaleData;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Data
@Table (name = "Student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String birth;
    private String address;
    private String phone;
    private String email;
    private String classroom;
    @ManyToOne
    @JoinColumn(name = "Classroom_id")
    private Classroom nation;

    public long getId ( ) {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getBirth ( ) {
        return birth;
    }

    public void setBirth (String birth) {
        this.birth = birth;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getPhone ( ) {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getClassroom ( ) {
        return classroom;
    }

    public void setClassroom (String classroom) {
        this.classroom = classroom;
    }

    public Classroom getNation ( ) {
        return nation;
    }

    public void setNation (Classroom nation) {
        this.nation = nation;
    }
}
