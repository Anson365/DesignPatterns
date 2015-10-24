package com.anson.behavioral.strategyPattern;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;

/**
 * 策略模式：策略决策者，提供使用策略及改变策略方法，策略来源可根据配置文件而来如hibernate中数据库dialect
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
			letter = new LetterA();  //设置默认策略 letterA
		}
		letter.speak();
	}
	
	/**
	 * 
	 * 改变策略
	 * @param letter
	 */
	public void changeContext(Letter letter){
		this.letter = letter;      
	}
}
