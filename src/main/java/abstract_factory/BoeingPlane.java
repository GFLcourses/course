package abstract_factory;

public class BoeingPlane implements PlaneInterface
{
    @Override
    public void flyOnPlane()
    {
        System.out.println("Boeing plane is flying");
    }
}
