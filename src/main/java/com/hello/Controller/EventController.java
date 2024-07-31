package com.hello.Controller;

import com.hello.Model.Contact;
import com.hello.Model.Evenement;
import com.hello.Service.EvenementService;
import com.hello.Service.EvenementserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth/Admin")
public class EventController {

    @Autowired
    private EvenementService evenementService;
    @PostMapping("/CreateEvent")
    public Evenement creerEvent(@RequestBody Evenement evenement) {
        return evenementService.CreateEvent(evenement);
    }

    @GetMapping("/show")
    public List<Evenement> getEvenet() {
        return evenementService.getAllEvent();
    }

    @DeleteMapping("/event/{id_event}")
    public void deleteEvent(@PathVariable Long id_event) {
        evenementService.deleteEvent(id_event);
    }

    @PutMapping("/event/update/{idEvent}")
    public Evenement updateEvent(@PathVariable Long idEvent, @RequestBody Evenement event) {
        event.setIdEvent(idEvent);
        return evenementService.updateEvent(event);
    }

    @GetMapping("/events/search")
    public List<Evenement> searchEvents(@RequestParam String nomEvent) {
        return evenementService.searchEvents(nomEvent);
    }
}

