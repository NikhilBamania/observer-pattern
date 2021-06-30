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
		new Tracker(weatherStation);
		new Tracker(weatherStation);

		for (int i = 0; i < 10; i++)
		{

			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			weatherStation.changeTemp();
		}

	}

}
