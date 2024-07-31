package com.hello.Dao;

import com.hello.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository  extends JpaRepository<Reservation, Long> {
}
