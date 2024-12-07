package io.github.stefanodpc.springarch.automaker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.stefanodpc.springarch.automaker.CarKey;
import io.github.stefanodpc.springarch.automaker.CarStatus;
import io.github.stefanodpc.springarch.automaker.Engine;
import io.github.stefanodpc.springarch.automaker.HondaHRV;

@RestController
public class TestFactoryController {

    @Autowired
    private Engine engine;
    
    @PostMapping
    public CarStatus startCar(@RequestBody CarKey carKey){
        var car = new HondaHRV(engine);
        return car.startIgnition(carKey);
    }
}
