package com.hello.Service;

import com.hello.Model.Reservation;

public interface ReserveSvice {

    Reservation createReservation(Long id_event, int id_user, String reservationDate);
}
