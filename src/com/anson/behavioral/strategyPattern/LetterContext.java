package com.anson.behavioral.strategyPattern;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;

/**
 * ����ģʽ�����Ծ����ߣ��ṩʹ�ò��Լ��ı���Է�����������Դ�ɸ��������ļ�������hibernate�����ݿ�dialect
 * @author daihua
 *
 */
public class LetterContext {
	
	private Letter letter;
	public LetterContext(Letter letter){
		this.letter = letter;
	}
	 
	public void speakContext(){
		if(letter==null){
			letter = new LetterA();  //����Ĭ�ϲ��� letterA
		}
		letter.speak();
	}
	
	/**
	 * 
	 * �ı����
	 * @param letter
	 */
	public void changeContext(Letter letter){
		this.letter = letter;      
	}
}
