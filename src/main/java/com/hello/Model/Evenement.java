package com.hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private long id_event;
=======
    private Long id_event;
>>>>>>> 3a38a1957beaa01eec1ed0a88cddb979325fdcbb
    private String nom_event;
    private String description;
    private String date_event;

    @JsonIgnore
    @OneToMany(mappedBy="evenement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Reservation> reservations;
}

