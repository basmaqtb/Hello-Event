package com.hello.Service;

import com.hello.Dao.EvenementRepository;
import com.hello.Dao.UserRepository;
import com.hello.Model.Contact;
import com.hello.Model.Evenement;
import com.hello.Model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementserviceImp implements  EvenementService{

    @Autowired
    private EvenementRepository evenementRepository;


    @Override
    public Evenement CreateEvent(Evenement event) {
        return  evenementRepository.save(event);
    }

    @Override
    public List<Evenement> getAllEvent() {
        return evenementRepository.findAll();
    }

    @Override
    public void deleteEvent(Long id_event) {
        evenementRepository.deleteById(id_event);
    }

    @Override
    public Evenement updateEvent(Evenement event) {
        Optional<Evenement> existingEventOpt = evenementRepository.findById(event.getIdEvent());

        if (existingEventOpt.isPresent()) {
            Evenement existingEvent = existingEventOpt.get();
            existingEvent.setNomEvent(event.getNomEvent());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setDateEvent(event.getDateEvent());
            return evenementRepository.save(existingEvent);
        } else {
            throw new RuntimeException("Event not found with id: " + event.getIdEvent());
        }
    }

    @Override
    public List<Evenement> searchEvents(String nomEvent) {
       if (nomEvent != null) {
        return evenementRepository.findByNomEvent(nomEvent);
        }
        return List.of(); // Return an empty list if date_event is null
    }

}
