package com.burrows.dailywagers.repository;

import com.burrows.dailywagers.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
