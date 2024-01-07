package com.example.testspringboot.repositories;

import com.example.testspringboot.entities.Washing_Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Washing_ServiceRepository extends JpaRepository<Washing_Service, Long> {
}
