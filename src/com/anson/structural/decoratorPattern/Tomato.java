package com.anson.structural.decoratorPattern;

public class Tomato extends NoodleDecorator{
	private NoodleDecorator decorator;

	public Tomato(NoodleDecorator decorator) {
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
		return  decorator.cost() + 2.0f;
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		this.decorator.describe();
		System.out.println("Œ˜∫Ï ¡…Ÿ–Ì");
	}
}
