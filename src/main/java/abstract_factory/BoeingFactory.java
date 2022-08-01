package abstract_factory;

public class BoeingFactory implements AirplaneFactoryInterface
{
    @Override
    public PlaneInterface createPlane()
    {
        return new BoeingPlane();
    }
    
    @Override
    public HelicopterInterface createHelicopter()
    {
        return new BoeingHelicopter();
    }
}
