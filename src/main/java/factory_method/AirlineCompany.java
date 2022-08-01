package factory_method;

public class AirlineCompany
{
    public static void main(String[] args)
    {
        BoeingCompany boeingCompany = new BoeingCompany();
        AirbusCompany airbusCompany = new AirbusCompany();
        
        Flyable boeingPlane = boeingCompany.createPlane();
        Flyable airbusPlane = airbusCompany.createPlane();
        
        boeingPlane.fly();
        airbusPlane.fly();
    }
}
