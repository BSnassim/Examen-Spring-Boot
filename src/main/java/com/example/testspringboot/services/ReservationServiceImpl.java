package com.example.testspringboot.services;

import com.example.testspringboot.entities.Reservation;
import com.example.testspringboot.entities.Status;
import com.example.testspringboot.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationServiceImpl implements ReservationService{
    private final ReservationRepository reservationRepository;

    @Override
    public Reservation insertReservation(Reservation a) {
        return reservationRepository.save(a);
    }

    @Override
    public Reservation updateReservation(Reservation a) {
        return reservationRepository.save(a);
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    //@Scheduled(fixedRate = 1000)
    //@Scheduled(fixedDelay = 3000)
    @Scheduled(cron = " */15 * * * * *")
    public void getReservation() {
        log.info("Reservation Scheduler :\n"+ reservationRepository.findAllByStatusOrderByTimeReservation(Status.PENDING).toString());
    }
}
