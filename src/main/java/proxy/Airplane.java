package proxy;

public class Airplane implements Flyable
{
    private int id;
    
    public Airplane(int id)
    {
        this.id = id;
        checkCondition();
    }
    
    public void checkCondition()
    {
        System.out.println("Getting airplane with id " + id + " ...");
        System.out.println("Checking technical condition...");
    }
    
    @Override
    public void launch()
    {
        System.out.println("Taking off...");
    }
}
