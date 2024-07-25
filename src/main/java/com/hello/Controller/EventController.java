package com.hello.Controller;

import com.hello.Model.Evenement;
import com.hello.Service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth/Admin")
public class EventController {

    @Autowired
    private EvenementService evenementService;
    @PostMapping("/CreateEvent")
    public Evenement creerCompte(@RequestBody Evenement evenement) {


        return evenementService.CreateEvent(evenement);
    }
}
