package com.example.testspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Entity
@RequiredArgsConstructor
public class Washing_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    private Float price;
    @Enumerated(EnumType.STRING)
    private Type type;

    @JsonIgnore
    @ManyToMany(mappedBy = "washingServices",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
