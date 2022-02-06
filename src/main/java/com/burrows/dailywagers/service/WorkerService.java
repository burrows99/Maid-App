package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public interface WorkerService {
    public List<Worker> getWorkers(String workerType);

    public Worker getWorker(@PathVariable Long id);

    public void postWorker(@PathVariable Worker worker);

    public void updateWorker(@PathVariable Worker worker);

    public ResponseEntity<HttpStatus> deleteWorker(Long id);
}