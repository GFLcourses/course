package Facade;

public class CarFactory {
    private String model;
    private EngineFactory engine;
    private FrameFactory frame;
    private WheelFactory wheels;

    public CarFactory(String model, EngineFactory engine, FrameFactory frame, WheelFactory wheels) {
        this.model = model;
        this.engine = engine;
        this.frame = frame;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineFactory getEngine() {
        return engine;
    }

    public void setEngine(EngineFactory engine) {
        this.engine = engine;
    }

    public FrameFactory getFrame() {
        return frame;
    }

    public void setFrame(FrameFactory frame) {
        this.frame = frame;
    }

    public WheelFactory getWheels() {
        return wheels;
    }

    public void setWheels(WheelFactory wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", frame=" + frame +
                ", wheels=" + wheels +
                '}';
    }
}
