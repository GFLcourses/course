package proxy;

public class Airport
{
    public static void main(String[] args)
    {
        Flyable airplane = new AirplaneProxy(3);
        airplane.launch();
    }
}
