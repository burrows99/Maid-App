package com.burrows.dailywagers.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Maid {
    private Long id;
    private List<String> servicesOffered;
    private List<DateTimeFormat> availability;
    private Integer rating;
    private Integer distance;
}
