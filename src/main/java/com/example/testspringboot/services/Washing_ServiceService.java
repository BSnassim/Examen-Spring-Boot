package com.example.testspringboot.services;
import com.example.testspringboot.entities.Washing_Service;

import java.util.List;

public interface Washing_ServiceService {
    void addWashingService(List<Washing_Service> washing_service);
    Washing_Service updateWashingService(Washing_Service u);
    Washing_Service getWashingService(Long id);
    List<Washing_Service> getWashingServices();
    void deleteWashingService(Long id);
}
