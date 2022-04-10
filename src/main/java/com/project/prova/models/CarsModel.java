package com.project.prova.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class CarsModel {
    
    private String _id;

    private String title;

    private String brand;

    private String price;

    private int age;
}