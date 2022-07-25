package DTO;

public class CarDTO {
    private String model;
    private double engineVolume;
    private double enginePower;
    private String color;
    private int wheelRadius;
    // And etc...


    public CarDTO(String model, double engineVolume, double enginePower, String color, int wheelRadius) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.color = color;
        this.wheelRadius = wheelRadius;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }
}
