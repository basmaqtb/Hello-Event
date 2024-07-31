package com.hello.Service;

import com.hello.Model.Evenement;

import java.util.List;
import java.util.Optional;

public interface EvenementService {
    Evenement CreateEvent(Evenement event);
    List<Evenement> getAllEvent();
    void deleteEvent(Long id) ;
    public Evenement updateEvent(Evenement event);
}
