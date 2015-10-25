package com.anson.test.structural.observerPattern;

import org.junit.Test;

import com.anson.behavioral.observerPattern.observable.Fresher;
import com.anson.behavioral.observerPattern.observer.AgeObserver;

public class TestObserverPattrern {
	@Test
	public void testObserverPattern() throws InterruptedException{
		Fresher fresher = new Fresher(10);
		AgeObserver ageObserver = new AgeObserver();
		fresher.addObserver(ageObserver);
		int i = 0;
		while(i<10){
			fresher.timeChange();
			Thread.sleep(3000);
			i++;
		}
	}
}
