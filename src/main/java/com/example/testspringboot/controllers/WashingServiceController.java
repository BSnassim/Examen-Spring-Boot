package com.example.testspringboot.controllers;

import com.example.testspringboot.entities.Washing_Service;
import com.example.testspringboot.services.Washing_ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("washingService")
public class WashingServiceController {
    private final Washing_ServiceService service;

    @PostMapping("/addServices")
    public void addWashingService(@RequestBody List<Washing_Service> washingServices){
        service.addWashingService(washingServices);
    }
}
