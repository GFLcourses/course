package decorator;

public class Pilot implements Piloted
{
    @Override
    public void flyPlane(Plane plane)
    {
        System.out.println("Flying plane...");
    }
}
