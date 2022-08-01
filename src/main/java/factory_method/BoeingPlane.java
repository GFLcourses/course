package factory_method;

public class BoeingPlane implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("Boeing plane is flying");
    }
}
