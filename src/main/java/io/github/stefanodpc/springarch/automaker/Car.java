package io.github.stefanodpc.springarch.automaker;

import java.awt.Color;

public class Car {
    private String model;
    private Color color;
    private Engine engine;
    private Automaker automaker;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Automaker getAutomaker() {
        return automaker;
    }
    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public CarStatus startIgnition(CarKey carKey){
        if(carKey.getAutomaker() != this.getAutomaker()){
            return new CarStatus("It is not possible to start the car with this key!");
        }
        return new CarStatus("Car started. Running with engine: " + engine);
    }
}
