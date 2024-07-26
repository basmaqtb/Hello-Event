package com.hello.Service;

import com.hello.Dao.EvenementRepository;
import com.hello.Dao.UserRepository;
import com.hello.Model.Evenement;
import com.hello.Model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementserviceImp implements  EvenementService{

    @Autowired
    private EvenementRepository evenementRepository;


    @Override
    public Evenement CreateEvent(Evenement event) {
        return  evenementRepository.save(event);
    }

}
