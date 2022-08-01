package abstract_factory;

public class AirbusPlane implements PlaneInterface
{
    @Override
    public void flyOnPlane()
    {
        System.out.println("Airbus plane is flying");
    }
}
