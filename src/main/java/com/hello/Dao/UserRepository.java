package com.hello.Dao;

import com.hello.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Utilisateur, Integer> {
    Optional<Utilisateur> findByEmail(String email);
//    Utilisateur findByIdUser(int id_user);
}


