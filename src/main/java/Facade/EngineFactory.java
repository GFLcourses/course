package Facade;

public class EngineFactory {
    private String cylinderBlock;
    private String supplySystem;
    private String coolingSystem;
    private String exhaustSystem;

    public EngineFactory(String cylinderBlock, String supplySystem, String coolingSystem, String exhaustSystem) {
        this.cylinderBlock = cylinderBlock;
        this.supplySystem = supplySystem;
        this.coolingSystem = coolingSystem;
        this.exhaustSystem = exhaustSystem;
    }

    public String getCylinderBlock() {
        return cylinderBlock;
    }

    public void setCylinderBlock(String cylinderBlock) {
        this.cylinderBlock = cylinderBlock;
    }

    public String getSupplySystem() {
        return supplySystem;
    }

    public void setSupplySystem(String supplySystem) {
        this.supplySystem = supplySystem;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public String getExhaustSystem() {
        return exhaustSystem;
    }

    public void setExhaustSystem(String exhaustSystem) {
        this.exhaustSystem = exhaustSystem;
    }

    @Override
    public String toString() {
        return "EngineFactory{" +
                "cylinderBlock='" + cylinderBlock + '\'' +
                ", supplySystem='" + supplySystem + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                ", exhaustSystem='" + exhaustSystem + '\'' +
                '}';
    }
}
