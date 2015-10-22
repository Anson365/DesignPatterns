package com.anson.creational.factoryPattern.factoryMethod;

import com.anson.creational.factoryPattern.abstractFactory.LetterAFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterBFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterCFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterFactory;

/**
 * 工厂方法模式，在抽象工厂的基础上根据需求实例化具体的工厂，然后再创建具体的对象
 * @author daihua
 *
 */
public class LetterFactoryMethod {
	public static LetterFactory getLetterFactory(String type){
		switch(type){
		case "A":{
			return new LetterAFactory();
		}
		case "B":{
			return new LetterBFactory();		
				}
		case "C":{
			return new LetterCFactory();
		}
		default:{
			return new LetterAFactory();
		}
	}
	}
}
