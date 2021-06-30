package com.crossasyst.designpattern.observerpattern.observer;

import com.crossasyst.designpattern.observerpattern.interfaces.Observer;
import com.crossasyst.designpattern.observerpattern.observable.WeatherStation;

public class Tracker implements Observer
{
	private WeatherStation weatherStation;

	public Tracker(WeatherStation weatherStation)
	{
		this.weatherStation = weatherStation;
		this.weatherStation.add(this);
	}

	public void update()
	{
		System.out.println("Temperature is " + weatherStation.getTemperature() + " from " + this.toString());
	}

}
