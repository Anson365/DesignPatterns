package com.anson.test.creational.factoryPatterns;

import org.junit.Test;

import com.anson.creational.factoryPattern.abstractFactory.LetterBFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterFactory;
import com.anson.creational.factoryPattern.extern.Letter;
import com.anson.creational.factoryPattern.factoryMethod.LetterFactoryMethod;
import com.anson.creational.factoryPattern.simpleFactory.SimpleFactory;

public class TestFactoryPatterns {
	@Test
	public void testSimpleFactory(){
		Letter a = SimpleFactory.createObject("A");
		a.speak();
	}
	@Test
	public void testAbstractFactory(){
		LetterFactory bFactory = new LetterBFactory();
		Letter b = bFactory.getLetter();
		b.speak();
	}
	@Test
	public void testFactoryMethod(){
		LetterFactory cFactory = LetterFactoryMethod.getLetterFactory("C");
		Letter c = cFactory.getLetter();
		c.speak();
	}
}
