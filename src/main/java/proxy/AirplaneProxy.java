package proxy;

public class AirplaneProxy implements Flyable
{
    private int id;
    private Flyable airplane;
    
    public AirplaneProxy(int id)
    {
        this.id = id;
    }
    
    @Override
    public void launch()
    {
        if (airplane == null)
        {
            airplane = new Airplane(id);
        }
        airplane.launch();
    }
}
