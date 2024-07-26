package com.hello.Service;

import com.hello.Model.Contact;
import com.hello.Model.Evenement;

import java.util.List;

public interface EvenementService {
    Evenement CreateEvent(Evenement event);
    List<Evenement> getAllEvent();
    void deleteEvent(Long id) ;
    public Evenement updateEvent(Evenement event);
    public List<Evenement> searchEvents(String date_event);
}
