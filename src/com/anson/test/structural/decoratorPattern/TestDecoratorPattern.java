package com.anson.test.structural.decoratorPattern;

import org.junit.Test;

import com.anson.creational.decoratorPattern.Meat;
import com.anson.creational.decoratorPattern.Noodle;
import com.anson.creational.decoratorPattern.NoodleDecorator;
import com.anson.creational.decoratorPattern.Tomato;

public class TestDecoratorPattern {
	@Test
	public void testDecoratorPattern(){
//		��������
		NoodleDecorator decorator = new NoodleDecorator();
		decorator = new Noodle(decorator);
		decorator = new Tomato(decorator);
		System.out.println(decorator.cost());
		decorator.describe();
		
		
//		��ɰ���
		NoodleDecorator decorator1 = new NoodleDecorator();
		decorator1 = new Noodle(decorator1);
		decorator1 = new Meat(decorator1);
		System.out.println(decorator1.cost());
		decorator1.describe();
	}
}
