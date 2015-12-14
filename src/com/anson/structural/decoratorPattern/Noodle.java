package com.anson.structural.decoratorPattern;

public class Noodle extends NoodleDecorator {
	private NoodleDecorator decorator;

	public Noodle(NoodleDecorator decorator) {
		super();
		this.decorator = decorator;
	}

	public NoodleDecorator getDecorator() {
		return decorator;
	}

	public void setDecorator(NoodleDecorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return this.decorator.cost() + 1.0f;
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		this.decorator.describe();
		System.out.println("ÃæÌõ");
	}

}
