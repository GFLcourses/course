package observer;

public class Pilot implements WeatherListener
{
    private String id;
    private WEATHER weather;
    private boolean awaitingGoodWeather;
    
    public Pilot(String id, WEATHER weather, boolean awaitingGoodWeather)
    {
        this.id = id;
        this.weather = weather;
        this.awaitingGoodWeather = awaitingGoodWeather;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public WEATHER getWeather()
    {
        return weather;
    }
    
    public boolean isAwaitingGoodWeather()
    {
        return awaitingGoodWeather;
    }
    
    public void setAwaitingGoodWeather(boolean awaitingGoodWeather)
    {
        this.awaitingGoodWeather = awaitingGoodWeather;
    }
    
    @Override
    public void updateWeather(WEATHER weather)
    {
        this.weather = weather;
        if (this.weather == WEATHER.GOOD && awaitingGoodWeather)
        {
            fly();
        }
    }
    
    public boolean fly()
    {
        if (weather == WEATHER.GOOD)
        {
            System.out.println("Flying...");
            return true;
        }
        
        awaitingGoodWeather = true;
        return false;
    }
}
