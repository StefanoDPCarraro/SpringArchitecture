package io.github.stefanodpc.springarch.automaker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.stefanodpc.springarch.automaker.Engine;
import io.github.stefanodpc.springarch.automaker.EngineType;

@Configuration
public class AutomakerConfiguration {
    
    @Bean
    public Engine engine(){
        var engine = new Engine();
        engine.setHorsepower(120);
        engine.setCilinders(4);
        engine.setModel("XPTO-0");
        engine.setLiters(2.0);
        engine.setType(EngineType.ASPIRATED);
        return engine;
    }

}
