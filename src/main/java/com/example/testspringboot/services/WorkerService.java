package com.example.testspringboot.services;

import com.example.testspringboot.entities.Worker;

import java.util.List;

public interface WorkerService {
    Worker addWorker(Worker u);
    Worker updateWorker(Worker u);
    Worker getWorker(Long id);
    List<Worker> getWorkers();
    void deleteWorker(Long id);
}
