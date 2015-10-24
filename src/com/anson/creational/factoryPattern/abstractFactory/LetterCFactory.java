package com.anson.creational.factoryPattern.abstractFactory;

import com.anson.extern.Letter;
import com.anson.extern.LetterC;

public class LetterCFactory implements  LetterFactory {

	@Override
	public Letter getLetter() {
		// TODO Auto-generated method stub
		return new LetterC();
	}
}
