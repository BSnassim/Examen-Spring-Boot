package com.example.testspringboot.controllers;

import com.example.testspringboot.entities.Vehicle;
import com.example.testspringboot.services.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicle")
public class VehicleController {
    private final VehicleService service;

    @PostMapping("/addVehicleAffect")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle, @RequestParam List<Long> idService){
        return service.addVehicleReservationAndAffectToWashingservicee(vehicle, idService);
    }
}
