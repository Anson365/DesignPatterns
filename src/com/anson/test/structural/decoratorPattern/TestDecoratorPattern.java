package com.anson.test.structural.decoratorPattern;

import org.junit.Test;

import com.anson.structural.decoratorPattern.Meat;
import com.anson.structural.decoratorPattern.Noodle;
import com.anson.structural.decoratorPattern.NoodleDecorator;
import com.anson.structural.decoratorPattern.Tomato;

public class TestDecoratorPattern {
	@Test
	public void testDecoratorPattern(){
//		西红柿面
		NoodleDecorator decorator = new NoodleDecorator();
		decorator = new Noodle(decorator);
		decorator = new Tomato(decorator);
		System.out.println(decorator.cost());
		decorator.describe();
		
		
//		肉干拌面
		NoodleDecorator decorator1 = new NoodleDecorator();
		decorator1 = new Noodle(decorator1);
		decorator1 = new Meat(decorator1);
		System.out.println(decorator1.cost());
		decorator1.describe();
	}
}
