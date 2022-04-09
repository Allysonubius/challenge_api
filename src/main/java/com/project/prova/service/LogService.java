package com.project.prova.service;

import java.util.*;
import javax.transaction.*;
import com.project.prova.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.project.prova.models.*;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    // Metodo GET
    @Transactional(rollbackOn =  Exception.class)
    public List<LogModels> getLogDB(){
        return this.logRepository.findAll();
    }

    @Transactional(rollbackOn =  Exception.class)
    public LogModels postLogDB(LogModels log){
        return this.logRepository.save(log);
    }
    
}
