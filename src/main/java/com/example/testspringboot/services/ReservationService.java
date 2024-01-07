package com.example.testspringboot.services;

import com.example.testspringboot.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation insertReservation(Reservation u);
    Reservation updateReservation(Reservation u);
    Reservation getReservation(Long id);
    List<Reservation> getReservations();
    void deleteReservation(Long id);
}
