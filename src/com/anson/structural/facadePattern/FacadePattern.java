package com.anson.structural.facadePattern;

import com.anson.extern.LetterA;
import com.anson.extern.LetterB;
import com.anson.extern.LetterC;

/**
 * 门面模式：将一组复杂的类包装到一个简易的接口当中（spring中的hibernate template）
 * @author daihua
 *
 */
public class FacadePattern {
	public void countOff(){
		new LetterA().speak();
		new LetterB().speak();
		new LetterC().speak();
	}
}
