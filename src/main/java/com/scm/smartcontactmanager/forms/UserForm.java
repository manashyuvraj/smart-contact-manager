package com.scm.smartcontactmanager.forms;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String about;
}