package com.hello.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;
    private String reservationDate;


    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private Utilisateur utilisateur;


    @ManyToOne
    @JoinColumn(name="id_event", nullable=false)
    private Evenement evenement;
}
