package com.hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_event;
    private String nom_event;
    private String description;
    private String date_event;

    @JsonIgnore
    @OneToMany(mappedBy="evenement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Reservation> reservations;
}

