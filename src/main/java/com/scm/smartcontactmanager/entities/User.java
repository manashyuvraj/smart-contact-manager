package com.scm.smartcontactmanager.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @Column(name = "user_id")
    private int userid;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(unique = true , nullable = false, name = "user_email")
    private String email;
    @Column(name = "user_password", nullable = false)
    private String password;
    @Column(name = "user_profilePic")
    private String profilePic;
    @Column(name = "user_phoneNumber")
    private String phoneNumber;
    private String about;
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;
    private Provider provider = Provider.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Contact> contacts = new ArrayList<>();

}
