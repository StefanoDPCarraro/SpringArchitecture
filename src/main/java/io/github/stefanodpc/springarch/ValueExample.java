package io.github.stefanodpc.springarch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueExample {
    // Gets variable from yml file
    @Value("${app.config.variable}")
    private String variable;

    public void printVar(){
        System.out.println(variable);
    }
}
