package com.example.testspringboot.repositories;

import com.example.testspringboot.entities.Reservation;
import com.example.testspringboot.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByStatusOrderByTimeReservation(Status status);
}
