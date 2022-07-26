package Facade;

public class WheelFactory {
    private String gum;
    private String wheelRims;

    public WheelFactory(String gum, String wheelRims) {
        this.gum = gum;
        this.wheelRims = wheelRims;
    }

    public String getGum() {
        return gum;
    }

    public void setGum(String gum) {
        this.gum = gum;
    }

    public String getWheelRims() {
        return wheelRims;
    }

    public void setWheelRims(String wheelRims) {
        this.wheelRims = wheelRims;
    }

    @Override
    public String toString() {
        return "WheelFactory{" +
                "gum='" + gum + '\'' +
                ", wheelRims='" + wheelRims + '\'' +
                '}';
    }
}
