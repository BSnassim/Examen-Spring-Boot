package com.example.testspringboot.controllers;

import com.example.testspringboot.entities.Worker;
import com.example.testspringboot.services.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("worker")
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping("/")
    public List<Worker> getWorkers(){
        return workerService.getWorkers();
    }

    @PostMapping("/")
    public Worker addWorker(@RequestBody Worker w){
        return workerService.addWorker(w);
    }
}
