package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;

import com.burrows.dailywagers.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
	@Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getWorkers(String workerType) {
        return null;
    }

    public Worker getWorker(String username) {
        return this.workerRepository.findByUsername(username);
    }

    public Worker postWorker(Worker worker) {
        return this.workerRepository.save(worker);
    }

    public Worker updateWorker(Worker worker) {
        Worker exsistingWorker = this.workerRepository.save(worker);
        return worker;
    }

    public void deleteWorker(String username) {
        Worker workerToBeDeleted = this.workerRepository.getById(username);
        this.workerRepository.delete(workerToBeDeleted);
    }
}