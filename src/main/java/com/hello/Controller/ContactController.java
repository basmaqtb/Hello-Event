package com.hello.Controller;

import com.hello.Model.Contact;
import com.hello.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/User")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/show")
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        contact.setId_contact(id); // Utilisation de l'ID défini dans le modèle Contact
        return contactService.updateContact(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
