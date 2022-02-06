package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Worker;
import com.burrows.dailywagers.repository.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class WorkerService {
	@Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getWorkers(String workerType) {
        return null;
    }

    public Worker getWorker(Long id) {
        return null;
    }

    public void postWorker(Worker worker) {
    }

    public void updateWorker(Worker worker) {

    }

    public ResponseEntity<HttpStatus> deleteWorker(Long id) {
        return null;
    }
}