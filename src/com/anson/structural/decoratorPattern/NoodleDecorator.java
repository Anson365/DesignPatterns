package com.anson.structural.decoratorPattern;

public class NoodleDecorator implements Decorator{
	public float cost(){
		return 2.0f;
	}
	public void describe(){
		System.out.println("�����������£�");
	}
}
