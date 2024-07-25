package com.hello.Dao;

import com.hello.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDao extends JpaRepository<Contact, Long> {
}
