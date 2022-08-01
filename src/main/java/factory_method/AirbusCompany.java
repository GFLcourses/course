package factory_method;

public class AirbusCompany
{
    public Flyable createPlane()
    {
        return new AirbusPlane();
    }
}
