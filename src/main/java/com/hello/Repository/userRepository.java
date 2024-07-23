package com.hello.Repository;

import com.hello.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

}
