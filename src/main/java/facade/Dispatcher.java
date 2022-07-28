package facade;

public class Dispatcher
{
    private boolean activeFlight;
    
    public boolean isActiveFlight()
    {
        return activeFlight;
    }
    
    public void startFlight()
    {
        System.out.println("Flight is active...");
        activeFlight = true;
    }
    
    public void finishFlight()
    {
        System.out.println("Flight is finished.");
        activeFlight = false;
    }
}
