package abstract_factory;

public class BoeingHelicopter implements HelicopterInterface
{
    @Override
    public void flyOnHelicopter()
    {
        System.out.println("Boeing helicopter is flying");
    }
}
