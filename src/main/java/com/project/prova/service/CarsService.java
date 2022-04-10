package com.project.prova.service;

import java.util.*;
import javax.transaction.*;
import com.project.prova.models.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class CarsService implements ApiConsumer{ 
    
    @Autowired
    ApiConsumer apiConsumer;
    
    // METODO GET
    @Transactional(rollbackOn = Exception.class)
    public List<CarsModel> getCarsApi() {
        return this.apiConsumer.getCarsApi();
    }

    // METODO POST
    @Transactional(rollbackOn = Exception.class)
    public CarsModel postCarApi(CarsModel carList) {
        return this.apiConsumer.postCarApi(carList);
    }

}
