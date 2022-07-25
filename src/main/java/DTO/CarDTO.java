package DTO;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", enginePower=" + enginePower +
                ", color='" + color + '\'' +
                ", wheelRadius=" + wheelRadius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDTO carDTO = (CarDTO) o;
        return Double.compare(carDTO.engineVolume, engineVolume) == 0 && Double.compare(carDTO.enginePower, enginePower) == 0 && wheelRadius == carDTO.wheelRadius && Objects.equals(model, carDTO.model) && Objects.equals(color, carDTO.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engineVolume, enginePower, color, wheelRadius);
    }
}
