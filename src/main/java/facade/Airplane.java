package facade;

public class Airplane
{
    public void makeFlight(Dispatcher dispatcher)
    {
        if (dispatcher.isActiveFlight())
        {
            System.out.println("Airplane is making flight...");
        }
        else
        {
            System.out.println("Checking technical condition...");
        }
    }
}
