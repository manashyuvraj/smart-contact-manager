package com.scm.smartcontactmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SocialLinkes {
    @Id
    private int id;
    private String link;
    private String title;

    @ManyToOne
    private Contact contact;
}
