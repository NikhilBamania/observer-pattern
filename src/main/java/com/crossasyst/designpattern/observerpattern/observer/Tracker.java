package com.crossasyst.designpattern.observerpattern.observer;

import com.crossasyst.designpattern.observerpattern.interfaces.Observer;
import com.crossasyst.designpattern.observerpattern.observable.WeatherStation;

public class Tracker implements Observer
{
	private WeatherStation weatherStation;
	private float temperature;

	public float getTemperature()
	{
		return temperature;
	}

	public Tracker(WeatherStation weatherStation)
	{
		this.weatherStation = weatherStation;
		this.weatherStation.add(this);
	}

	public void update()
	{
		temperature = weatherStation.getTemperature();
		System.out.println("Temperature is " + this.temperature + " from " + this.toString());
	}

}
