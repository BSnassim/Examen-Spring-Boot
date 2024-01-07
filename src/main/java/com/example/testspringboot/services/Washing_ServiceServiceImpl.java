package com.example.testspringboot.services;

import com.example.testspringboot.entities.Washing_Service;
import com.example.testspringboot.repositories.Washing_ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Washing_ServiceServiceImpl implements Washing_ServiceService{
    private final Washing_ServiceRepository repository;
    @Override
    public void addWashingService(List<Washing_Service> washing_service) {
        repository.saveAll(washing_service);
    }

    @Override
    public Washing_Service updateWashingService(Washing_Service u) {
        return null;
    }

    @Override
    public Washing_Service getWashingService(Long id) {
        return null;
    }

    @Override
    public List<Washing_Service> getWashingServices() {
        return null;
    }

    @Override
    public void deleteWashingService(Long id) {

    }
}
