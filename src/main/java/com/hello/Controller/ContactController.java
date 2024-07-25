package com.hello.Controller;

import com.hello.Model.Contact;
import com.hello.Service.ContactService;
import com.hello.Service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @GetMapping
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }
    @PostMapping("")
    public Contact addContact(@RequestBody Contact contact) {

        return contactService.addContact(contact);
    }

}
