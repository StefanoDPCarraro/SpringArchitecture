package io.github.stefanodpc.springarch.automaker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.github.stefanodpc.springarch.automaker.Engine;
import io.github.stefanodpc.springarch.automaker.EngineType;

@Configuration
public class AutomakerConfiguration {
    //Not necessary but possible (default name = method name)
    //@Primary defines the default bean
    @Bean(name="aspiratedEngine") 
    @Primary
    public Engine aspiratedEngine(){
        var engine = new Engine();
        engine.setHorsepower(120);
        engine.setCilinders(4);
        engine.setModel("XPTO-0");
        engine.setLiters(2.0);
        engine.setType(EngineType.ASPIRATED);
        return engine;
    }

    @Bean
    public Engine turboEngine(){
        var engine = new Engine();
        engine.setHorsepower(180);
        engine.setCilinders(4);
        engine.setModel("XPTO-01");
        engine.setLiters(1.5);
        engine.setType(EngineType.TURBO);
        return engine;
    }

    @Bean
    public Engine electricEngine(){
        var engine = new Engine();
        engine.setHorsepower(110);
        engine.setCilinders(3);
        engine.setModel("TH-40");
        engine.setLiters(1.4);
        engine.setType(EngineType.ELECTRIC);
        return engine;
    }

}
