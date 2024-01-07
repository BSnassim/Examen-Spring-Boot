package com.example.testspringboot.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDateTime timeReservation;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Worker worker;
    @ManyToMany
    private List<Washing_Service> washingServices=new ArrayList<Washing_Service>();
}
