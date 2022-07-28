package facade;

public class FlightManager
{
    Airplane airplane = new Airplane();
    Flight flight = new Flight();
    Dispatcher dispatcher = new Dispatcher();
    
    public void manageFlight()
    {
        flight.fly();
        dispatcher.startFlight();
        airplane.makeFlight(dispatcher);
        dispatcher.finishFlight();
    }
}
