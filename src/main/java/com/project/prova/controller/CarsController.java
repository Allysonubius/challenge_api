package com.project.prova.controller;

import java.time.LocalDateTime;
import java.util.*;
import com.project.prova.models.*;
import com.project.prova.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST CARS")
public class CarsController {
     
    @Autowired
    CarsService carsServiceController;

    @Autowired
    LogService logService;

    @GetMapping(value="/listCars")
    @ApiOperation(value="API REST -  CAR TO LIST API")
    public ResponseEntity<List<CarsModel>> getCars(){
        List<CarsModel> listCar = this.carsServiceController.getCarsApi();
        return listCar != null ? ResponseEntity.ok().body(listCar) : ResponseEntity.notFound().build();
    }
    
    @PostMapping(value = "/createCar")
    @ApiOperation(value="API REST - INSERT CAR TO LIST API")
    public ResponseEntity<CarsModel> createCar(@RequestBody CarsModel carList){
        CarsModel postCar = this.carsServiceController.postCarApi(carList);
        LogModels log = new LogModels();
        log.setCar_id(postCar.get_id());
        log.setDate_hora(LocalDateTime.now());
        this.logService.postLogDB(log);
        return ResponseEntity.ok().body(postCar);
    }

}