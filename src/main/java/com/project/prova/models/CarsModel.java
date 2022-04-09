package com.project.prova.models;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name="CARS")
public class CarsModel {
    
    @Id
    private String _id;

    private String title;
    private String brand;
    private String price;
    private int age;
}