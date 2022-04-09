package com.project.prova.models;

import java.time.*;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name="LOG")
public class LogModels {
    
    @Id
    private Long id;
    private LocalDateTime date_hora;
    private Long car_id;
}
