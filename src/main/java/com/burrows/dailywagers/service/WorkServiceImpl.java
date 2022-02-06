package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import com.burrows.dailywagers.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class WorkServiceImpl implements WorkerService{
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> getWorkers(String workerType) {
        return null;
    }

    @Override
    public Worker getWorker(Long id) {
        return null;
    }

    @Override
    public void postWorker(Worker worker) {
    }

    @Override
    public void updateWorker(Worker worker) {

    }

    @Override
    public ResponseEntity<HttpStatus> deleteWorker(Long id) {
        return null;
    }
}
