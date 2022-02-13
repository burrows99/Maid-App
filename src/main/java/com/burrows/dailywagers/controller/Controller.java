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

    @GetMapping("/home")
    public String getHome(){
        return "This is Home Page.";
    }

    @GetMapping("/{workerType}")
    public List<Worker> getWorkers(@PathVariable("workerType") String workerType){
        return this.workerService.getWorkers(workerType);
    }

    @GetMapping("/{username}")
    public Worker getWorker(@PathVariable("username") String username){
        return this.workerService.getWorker(username);
    }

    @PostMapping("/{worker}")
    public Worker postWorker(@RequestBody Worker worker){
        return this.workerService.postWorker(worker);
    }

    @PutMapping("/{worker}")
    public void updateWorker(@RequestBody Worker worker){
        this.workerService.updateWorker(worker);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<HttpStatus> deleteWorker(@PathVariable("useername") String username){
        try {
            this.workerService.deleteWorker(username);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
