package com.scm.smartcontactmanager.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Contact {
    @Id
    private int id;
    private String name;
    private String email;
    private String PhoneNumber;
    private String address;
    private String picture;
    private String description;
    private boolean favorite = false;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "contact" , fetch = FetchType.EAGER)
    private List<SocialLinkes> socialLinkes = new ArrayList<>();
}
