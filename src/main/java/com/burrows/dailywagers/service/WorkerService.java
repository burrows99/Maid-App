package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;

import java.util.List;

public interface WorkerService {
    public List<Worker> getWorkers(String workerType);
    public Worker getWorker(Long id);
    public void postWorker(Worker worker);
    public void deleteWorker(Long id);
    public void updateWorker(Worker worker);
}
