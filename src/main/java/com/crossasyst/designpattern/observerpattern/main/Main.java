package com.crossasyst.designpattern.observerpattern.main;

import com.crossasyst.designpattern.observerpattern.observable.WeatherStation;
import com.crossasyst.designpattern.observerpattern.observer.Tracker;

public class Main
{
	WeatherStation weatherStation = new WeatherStation();
	Tracker tracker1 = new Tracker(weatherStation);
	Tracker tracker2 = new Tracker(weatherStation);

	public static void main(String[] args)
	{
		WeatherStation weatherStation = new WeatherStation();
		Tracker tracker1 = new Tracker(weatherStation);
		Tracker tracker2 = new Tracker(weatherStation);

		weatherStation.changeTemp();
	}

}
