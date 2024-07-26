package com.hello.Service;

import com.hello.Dao.EvenementRepository;
import com.hello.Dao.UserRepository;
import com.hello.Model.Contact;
import com.hello.Model.Evenement;
import com.hello.Model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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
        Optional<Evenement> existingEventOpt = evenementRepository.findById(event.getId_event());

        if (existingEventOpt.isPresent()) {
            Evenement existingEvent = existingEventOpt.get();
            existingEvent.setNom_event(event.getNom_event());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setDate_event(event.getDate_event());
            return evenementRepository.save(existingEvent);
        } else {
            throw new RuntimeException("Event not found with id: " + event.getId_event());
        }
    }

}

