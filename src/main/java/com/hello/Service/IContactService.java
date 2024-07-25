package com.hello.Service;

import com.hello.Model.Contact;

import java.util.List;

public interface IContactService {

    Contact addContact(Contact contact);

    List<Contact> getAllContacts();
    Contact updateContact(Contact contact);

    void deleteContact(int id);



}
