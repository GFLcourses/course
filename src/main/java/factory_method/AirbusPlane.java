package factory_method;

public class AirbusPlane implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("Airbus plane is flying");
    }
}
