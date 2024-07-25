package com.hello.Service;

import com.hello.Model.Evenement;

import java.util.List;

public interface EvenementService {
    Evenement CreateEvent(Evenement event);

    List<Evenement> getAllEvent();
    void deleteCompte(int id_event) ;
}
