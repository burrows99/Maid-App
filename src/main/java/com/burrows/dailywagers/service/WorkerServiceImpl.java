package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import com.burrows.dailywagers.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class WorkerServiceImpl implements WorkerService{
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> getWorkers(String workerType) {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorker(Long id) {
        return workerRepository.getById(id);
    }

    @Override
    public void postWorker(Worker worker) {
        workerRepository.save(worker);
    }

    @Override
    public void deleteWorker(Long id) {
        Worker workerToBeDeleted = workerRepository.getById(id);
        workerRepository.delete(workerToBeDeleted);
    }

    @Override
    public void updateWorker(Worker worker) {
        workerRepository.save(worker);
    }

}