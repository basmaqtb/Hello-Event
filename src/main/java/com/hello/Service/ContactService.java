package com.hello.Service;

import com.hello.Dao.ContactDao;
import com.hello.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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
        Optional<Contact> existingContactOpt = contactDao.findById(contact.getId_contact());

        if (existingContactOpt.isPresent()) {
            Contact existingContact = existingContactOpt.get();
            existingContact.setName(contact.getName());
            existingContact.setMessage(contact.getMessage());
            existingContact.setPhone(contact.getPhone());
            existingContact.setDate(contact.getDate());
            return contactDao.save(existingContact);
        } else {
            throw new RuntimeException("Contact not found with id: " + contact.getId_contact());
        }
    }

    @Override
    public void deleteContact(Long id_contact) {
        Optional<Contact> existingContactOpt = contactDao.findById(id_contact);

        if (existingContactOpt.isPresent()) {
            contactDao.deleteById(id_contact);
        } else {
            throw new RuntimeException("Contact not found with id: " + id);
        }
    }


    }

