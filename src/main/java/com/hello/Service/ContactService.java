package com.hello.Service;

import com.hello.Dao.ContactDao;
import com.hello.Dao.UserRepository;
import com.hello.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService implements IContactService {
   @Autowired
   private ContactDao contactDao;
   @Autowired
   private UserRepository userDao;

    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public Contact addContact(Contact contact, int idUser) {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return List.of();
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }




    @Override
    public void deleteContact(Long id) {

    }
}
