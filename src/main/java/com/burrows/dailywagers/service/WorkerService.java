package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import com.burrows.dailywagers.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getWorkers(String workerType) {
        return workerRepository.findAll();
    }

    public Worker getWorker(Long id) {
        return workerRepository.getById(id);
    }

    public void postWorker(Worker worker) {
        workerRepository.save(worker);
    }

    public void deleteWorker(Long id) {
        Worker workerToBeDeleted = workerRepository.getById(id);
        workerRepository.delete(workerToBeDeleted);
    }

    public void updateWorker(Worker worker) {
        workerRepository.save(worker);
    }
}
