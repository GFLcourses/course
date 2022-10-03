package decorator;

public class PilotManager implements Piloted
{
    private Pilot pilot;
    
    public PilotManager(Pilot pilot)
    {
        this.pilot = pilot;
    }
    
    public Pilot getPilot()
    {
        return pilot;
    }
    
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot;
    }
    
    @Override
    public void flyPlane(Plane plane)
    {
        if (plane.isReadyToFlight())
        {
            pilot.flyPlane(plane);
        }
        else
        {
            throw new RuntimeException("Plane is not ready to flight");
        }
    }
}
