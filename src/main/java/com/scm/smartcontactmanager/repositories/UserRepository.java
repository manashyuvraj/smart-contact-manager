package com.scm.smartcontactmanager.repositories;

import com.scm.smartcontactmanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

    User findByEmail(String email);
}
