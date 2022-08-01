package abstract_factory;

public class AirbusFactory implements AirplaneFactoryInterface
{
    @Override
    public PlaneInterface createPlane()
    {
        return new AirbusPlane();
    }
    
    @Override
    public HelicopterInterface createHelicopter()
    {
        return new AirbusHelicopter();
    }
}
