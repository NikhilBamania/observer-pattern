package com.crossasyst.designpattern.observerpattern.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Observable
{
	List<Observer> observerList = new ArrayList<Observer>();

	void add(Observer observer);

	void remove(Observer observer);

	void notifyObserver();
}
