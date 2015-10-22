package com.anson.creational.factoryPattern.simpleFactory;

import com.anson.creational.factoryPattern.extern.Letter;
import com.anson.creational.factoryPattern.extern.LetterA;
import com.anson.creational.factoryPattern.extern.LetterB;
import com.anson.creational.factoryPattern.extern.LetterC;

/**
 * 简单工厂模式 特点：直接返回需要的对象，一个工厂加载各类对象
 * @author daihua
 *
 */
public class SimpleFactory {
	public static Letter createObject(String type){
		switch(type){
			case "A":{
				return new LetterA();
			}
			case "B":{
				return new LetterB();		
					}
			case "C":{
				return new LetterC();
			}
			default:{
				return new LetterA();
			}
		}
	}
}
