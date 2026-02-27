package com.scm.smartcontactmanager.services;

import com.scm.smartcontactmanager.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(String id);

    void deleteUser(String id);

    List<User>  getAllUser();
}
