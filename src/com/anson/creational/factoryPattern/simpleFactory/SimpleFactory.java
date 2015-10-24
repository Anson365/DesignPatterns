package com.anson.creational.factoryPattern.simpleFactory;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;
import com.anson.extern.LetterB;
import com.anson.extern.LetterC;

/**
 * �򵥹���ģʽ �ص㣺ֱ�ӷ�����Ҫ�Ķ���һ���������ظ������
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
