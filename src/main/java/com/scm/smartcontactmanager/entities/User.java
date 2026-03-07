package com.scm.smartcontactmanager.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
public class User implements UserDetails {
    @Id
    @Column(name = "user_id")
    private String userid;
    @Column(name = "user_name", nullable = false)
    private String name;
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
    @Enumerated(value = EnumType.STRING)
    private Provider provider = Provider.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
