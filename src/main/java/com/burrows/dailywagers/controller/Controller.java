package com.burrows.dailywagers.controller;

import com.burrows.dailywagers.model.Worker;
import com.burrows.dailywagers.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
@Component
@ComponentScan("com.burrows.dailywagers.service.WorkerService")
public class Controller {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/{workerType}")
    public List<Worker> getWorkers(@PathVariable String workerType){
        return this.workerService.getWorkers(workerType);
    }

    @GetMapping("/{id}")
    public Worker getWorker(@PathVariable Long id){
        return this.workerService.getWorker(id);
    }

    @PostMapping("/{worker}")
    public void postWorker(@PathVariable Worker worker){
        this.workerService.postWorker(worker);
    }

    @PutMapping("/{worker}")
    public void updateWorker(@PathVariable Worker worker){
        this.workerService.updateWorker(worker);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteWorker(@PathVariable Long id){
        try {
            this.workerService.deleteWorker(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
