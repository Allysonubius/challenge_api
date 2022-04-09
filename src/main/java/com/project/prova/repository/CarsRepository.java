package com.project.prova.repository;

import com.project.prova.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CarsRepository extends JpaRepository<CarsModel, String> {
    
}
