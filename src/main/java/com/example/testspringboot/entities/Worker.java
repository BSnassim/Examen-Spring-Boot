package com.example.testspringboot.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Entity
@RequiredArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgent;
    private String name;
    private String nic;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
