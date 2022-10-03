package observer;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher
{
    private List<WeatherListener> weatherListeners;
    private WEATHER weather;
    
    public Dispatcher(WEATHER weather)
    {
        weatherListeners = new ArrayList<>();
        this.weather = weather;
    }
    
    public WEATHER getWeather()
    {
        return weather;
    }
    
    public void updateWeather(WEATHER weather)
    {
        if (this.weather != weather)
        {
            for (WeatherListener weatherListener : weatherListeners)
            {
                weatherListener.updateWeather(weather);
            }
        }
        this.weather = weather;
    }
    
    public void addWeatherListener(Pilot pilot)
    {
        weatherListeners.add(pilot);
    }
    
    public void removeWeatherListener(Pilot pilot)
    {
        weatherListeners.remove(pilot);
    }
}
