package com.anson.structural.facadePattern;

import com.anson.extern.LetterA;
import com.anson.extern.LetterB;
import com.anson.extern.LetterC;

/**
 * ����ģʽ����һ�鸴�ӵ����װ��һ�����׵Ľӿڵ��У�spring�е�hibernate template��
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
