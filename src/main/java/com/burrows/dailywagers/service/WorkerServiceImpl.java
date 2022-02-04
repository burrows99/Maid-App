package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService{

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
}