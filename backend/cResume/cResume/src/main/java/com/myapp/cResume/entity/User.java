package com.myapp.cResume.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "intro")
    private String intro;


//    ----------------------- relations -------------------------

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Course> courses = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private  Set<Link> links = new HashSet<>();

}
