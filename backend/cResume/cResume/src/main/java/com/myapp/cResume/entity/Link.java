package com.myapp.cResume.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "link")
@Getter
@Setter
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "url")
    private String url;

//    ----------------------- relations -------------------------
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;


}
