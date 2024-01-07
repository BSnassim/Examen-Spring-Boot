package com.example.testspringboot.services;

import com.example.testspringboot.entities.Worker;
import com.example.testspringboot.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepository workerRepository;

    @Override
    public Worker addWorker(Worker a) {
        return workerRepository.save(a);
    }

    @Override
    public Worker updateWorker(Worker a) {
        return workerRepository.save(a);
    }

    @Override
    public Worker getWorker(Long id) {
        return workerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Worker> getWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public void deleteWorker(Long id) {
        workerRepository.deleteById(id);
    }

}
