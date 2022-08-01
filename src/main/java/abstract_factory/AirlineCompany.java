package abstract_factory;

public class AirlineCompany
{
    public static void main(String[] args)
    {
        AirplaneFactoryInterface boeingFactory = new BoeingFactory();
        AirplaneFactoryInterface airbusFactory = new AirbusFactory();
        
        PlaneInterface boeingPlane = boeingFactory.createPlane();
        PlaneInterface airbusPlane = airbusFactory.createPlane();
        
        HelicopterInterface boeingHelicopter = boeingFactory.createHelicopter();
        HelicopterInterface airbusHelicopter = airbusFactory.createHelicopter();
        
        boeingPlane.flyOnPlane();
        airbusPlane.flyOnPlane();
        
        boeingHelicopter.flyOnHelicopter();
        airbusHelicopter.flyOnHelicopter();
    }
}
