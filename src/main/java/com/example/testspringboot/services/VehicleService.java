package com.example.testspringboot.services;

import com.example.testspringboot.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle insertVehicle(Vehicle u);
    Vehicle updateVehicle(Vehicle u);
    Vehicle getVehicle(Long id);
    List<Vehicle> getVehicles();
    void deleteVehicle(Long id);
    Vehicle addVehicleReservationAndAffectToWashingservicee(Vehicle vehicle, List<Long> idService);
}
