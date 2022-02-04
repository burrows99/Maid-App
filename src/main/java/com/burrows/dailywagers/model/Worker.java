package com.burrows.dailywagers.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Worker {
    @Id
    private Long id;
    private String workerType;
    private List<String> servicesOffered;
    private List<DateTimeFormat> availability;
    private Integer rating;
}
