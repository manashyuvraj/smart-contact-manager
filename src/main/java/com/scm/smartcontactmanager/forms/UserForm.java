package com.scm.smartcontactmanager.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserForm {
    @NotNull(message = "username is required")
    private String name;
    @Email(message = "email is required")
    @NotNull
    private String email;
    @Size(min = 6 , max = 10 , message = "length 6-10")
    private String password;
    @Size(min = 10, max = 12)
    @NotNull(message = "number is required")
    private String phoneNumber;
    private String about;
}