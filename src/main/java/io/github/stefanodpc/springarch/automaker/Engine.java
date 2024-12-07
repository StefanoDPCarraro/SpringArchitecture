package io.github.stefanodpc.springarch.automaker;

public class Engine {
    private String model;
    private Integer horsepower;
    private Integer cilinders;
    private Double liters;
    private EngineType type;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }
    public Integer getCilinders() {
        return cilinders;
    }
    public void setCilinders(Integer cilinders) {
        this.cilinders = cilinders;
    }
    public Double getLiters() {
        return liters;
    }
    public void setLiters(Double liters) {
        this.liters = liters;
    }
    public EngineType getType() {
        return type;
    }
    public void setType(EngineType type) {
        this.type = type;
    }
}
