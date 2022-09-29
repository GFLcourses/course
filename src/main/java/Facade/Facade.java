package Facade;

public class Facade {
    public static void main(String[] args) {
        CarFactory audiR8 = new CarFactory("Audi R8",new EngineFactory("cylinder for Audi R8","Supply sustem for AudiR8","Cooling system for audiR8 ","Exhaust system for Audi R8")
                ,new FrameFactory("Doors class A1","Sport roof class B1","hood class A1","bumper class A1"),
                new WheelFactory("Falken wheels","Racing Hart CX312"));
        System.out.println(audiR8);
    }
}
