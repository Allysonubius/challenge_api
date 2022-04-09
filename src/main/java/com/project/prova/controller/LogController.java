package com.project.prova.controller;

import java.util.*;
import com.project.prova.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import com.project.prova.models.*;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST LOG")
public class LogController {
    
    @Autowired
    LogService logService;

    @GetMapping(value="logs")
    @ApiOperation(value="REST API - INFO LOGS")
    public ResponseEntity<List<LogModels>> getLog(){
        List<LogModels> listLog = this.logService.getLogDB();
        return listLog != null ? ResponseEntity.ok().body(listLog) : ResponseEntity.notFound().build();
    }
}
