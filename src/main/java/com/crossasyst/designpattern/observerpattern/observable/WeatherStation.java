package com.crossasyst.designpattern.observerpattern.observable;

import com.crossasyst.designpattern.observerpattern.interfaces.Observable;
import com.crossasyst.designpattern.observerpattern.interfaces.Observer;

import lombok.Getter;

@Getter
public class WeatherStation implements Observable
{
	private float temperature;

	public void notifyObserver()
	{
		for (Observer observer : observerList)
		{
			observer.update();
		}
	}

	public void add(Observer observer)
	{
		observerList.add(observer);
	}

	public void remove(Observer observer)
	{
		observerList.remove(observer);
	}

	public void changeTemp()
	{
		temperature++;
		this.notifyObserver();
	}

}
