package com.project.prova.repository;

import com.project.prova.models.LogModels;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface LogRepository extends JpaRepository<LogModels, Long> {
    
}
