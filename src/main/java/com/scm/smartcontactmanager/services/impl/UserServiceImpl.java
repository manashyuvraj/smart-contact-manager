package com.scm.smartcontactmanager.services.impl;

import com.scm.smartcontactmanager.entities.User;
import com.scm.smartcontactmanager.repositories.UserRepository;
import com.scm.smartcontactmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserid(userId);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
