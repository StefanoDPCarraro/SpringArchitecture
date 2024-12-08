package io.github.stefanodpc.springarch.automaker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.stefanodpc.springarch.automaker.CarKey;
import io.github.stefanodpc.springarch.automaker.CarStatus;
import io.github.stefanodpc.springarch.automaker.Engine;
import io.github.stefanodpc.springarch.automaker.HondaHRV;

@RestController
@RequestMapping("cars")
public class TestFactoryController {

    // @Qualifier defines the bean being used
    // Alternatively changing the variable name also defines it

    @Autowired
    //@Qualifier("electricEngine")
    @Electric
    private Engine engine;
    
    @PostMapping
    public CarStatus startCar(@RequestBody CarKey carKey){
        var car = new HondaHRV(engine);
        return car.startIgnition(carKey);
    }
}
