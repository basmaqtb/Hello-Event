package com.hello.Service;

import com.hello.Model.Contact;
import com.hello.Model.Evenement;

import java.util.List;

public interface EvenementService {
    Evenement CreateEvent(Evenement event);
<<<<<<< HEAD
=======
    List<Evenement> getAllEvent();
    void deleteEvent(Long id) ;
    public Evenement updateEvent(Evenement event);
>>>>>>> 3a38a1957beaa01eec1ed0a88cddb979325fdcbb
}
