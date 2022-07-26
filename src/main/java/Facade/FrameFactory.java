package Facade;

public class FrameFactory {
    private String doors;
    private String roof;
    private String hood;
    private String bumper;

    public FrameFactory(String doors, String roof, String hood, String bumper) {
        this.doors = doors;
        this.roof = roof;
        this.hood = hood;
        this.bumper = bumper;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getHood() {
        return hood;
    }

    public void setHood(String hood) {
        this.hood = hood;
    }

    public String getBumper() {
        return bumper;
    }

    public void setBumper(String bumper) {
        this.bumper = bumper;
    }

    @Override
    public String toString() {
        return "FrameFactory{" +
                "doors='" + doors + '\'' +
                ", roof='" + roof + '\'' +
                ", hood='" + hood + '\'' +
                ", bumper='" + bumper + '\'' +
                '}';
    }
}
