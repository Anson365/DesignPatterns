package com.anson.behavioral.observerPattern.observer;

import java.util.Observable;
import java.util.Observer;

import com.anson.behavioral.observerPattern.observable.Fresher;

public class AgeObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Fresher){
			Fresher fresher = (Fresher)o;
			System.out.println("current fresher's age is "+(int)arg);
		}
	}

}
