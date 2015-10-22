package com.anson.creational.factoryPattern.factoryMethod;

import com.anson.creational.factoryPattern.abstractFactory.LetterAFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterBFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterCFactory;
import com.anson.creational.factoryPattern.abstractFactory.LetterFactory;

/**
 * ��������ģʽ���ڳ��󹤳��Ļ����ϸ�������ʵ��������Ĺ�����Ȼ���ٴ�������Ķ���
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
