package com.project.prova.service;

import java.util.List;
import com.project.prova.models.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

@FeignClient(url="http://api-test.bhut.com.br:3000/", name="api")
public interface ApiConsumer {
    
    @GetMapping(value="api/cars")
    List<CarsModel> getCarsApi();

    @PostMapping(value="api/cars")
    CarsModel postCarApi(CarsModel carList);

}
