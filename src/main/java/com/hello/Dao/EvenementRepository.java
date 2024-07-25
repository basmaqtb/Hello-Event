package com.hello.Dao;

import com.hello.Model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository  extends JpaRepository<Evenement, Long> {

}
