package decorator;

public class Plane
{
    private int planeId;
    private boolean readyToFlight;
    
    public Plane(int planeId, boolean readyToFlight)
    {
        this.planeId = planeId;
        this.readyToFlight = readyToFlight;
    }
    
    public int getPlaneId()
    {
        return planeId;
    }
    
    public void setPlaneId(int planeId)
    {
        this.planeId = planeId;
    }
    
    public boolean isReadyToFlight()
    {
        return readyToFlight;
    }
    
    public void setReadyToFlight(boolean readyToFlight)
    {
        this.readyToFlight = readyToFlight;
    }
}
