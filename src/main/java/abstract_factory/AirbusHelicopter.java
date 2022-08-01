package abstract_factory;

public class AirbusHelicopter implements HelicopterInterface
{
    @Override
    public void flyOnHelicopter()
    {
        System.out.println("Airbus helicopter is flying");
    }
}
