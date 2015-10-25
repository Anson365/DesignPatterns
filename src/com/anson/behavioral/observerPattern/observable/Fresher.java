package com.anson.behavioral.observerPattern.observable;

import java.util.Observable;

public class Fresher extends Observable {
	private int age;
	
	public Fresher(int age) {
		// TODO Auto-generated constructor stub
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(this.age!=age){
			super.setChanged();
			notifyObservers(age);
		}
		this.age = age;
	}
	
	
	
	public void timeChange(){
		int age = this.getAge();
		this.setAge(++age);
	}
	
}
