package factory_method;

public class BoeingCompany
{
    public Flyable createPlane()
    {
        return new BoeingPlane();
    }
}
