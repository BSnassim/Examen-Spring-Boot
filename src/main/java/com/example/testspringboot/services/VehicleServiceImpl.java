package com.example.testspringboot.services;

import com.example.testspringboot.entities.Reservation;
import com.example.testspringboot.entities.Status;
import com.example.testspringboot.entities.Vehicle;
import com.example.testspringboot.entities.Washing_Service;
import com.example.testspringboot.repositories.VehicleRepository;
import com.example.testspringboot.repositories.Washing_ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService{
    private final VehicleRepository vehicleRepository;
    private final ReservationService reservationService;
    private final Washing_ServiceRepository washingServiceRepository;

    @Override
    public Vehicle insertVehicle(Vehicle a) {
        return vehicleRepository.save(a);
    }

    @Override
    public Vehicle updateVehicle(Vehicle a) {
        return vehicleRepository.save(a);
    }

    @Override
    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public Vehicle addVehicleReservationAndAffectToWashingservicee(Vehicle vehicle, List<Long> idService) {
        List<Washing_Service> services = washingServiceRepository.findAllById(idService);
        Reservation reservation = new Reservation();
        reservation.setTimeReservation(LocalDateTime.now().plusHours(2));
        reservation.setStatus(Status.PENDING);
        reservation.setWashingServices(services);
        Set<Reservation> reservations = new HashSet<>();
        reservations.add(reservationService.insertReservation(reservation));
        vehicle.setReservations(reservations);
        return vehicleRepository.save(vehicle);
    }

}
