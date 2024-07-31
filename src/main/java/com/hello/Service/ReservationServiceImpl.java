package com.hello.Service;

import com.hello.Dao.ReservationRepository;
import com.hello.Model.Evenement;
import com.hello.Model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements  ReserveSvice{

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private  EvenementService evenementService;


    @Override
    public Reservation createReservation(Long id_event, int id_user, String reservationDate) {
    return null;
    }
}
