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


    @Override
    public Contact addContact(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactDao.findAll();
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }
    @Override
    public void deleteContact(int id) {
        contactDao.deleteById((long) id);
    }

}
