package com.example.testspringboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Entity
@RequiredArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdVehicle;
    private String brand;
    private String immatriculation;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;
}
