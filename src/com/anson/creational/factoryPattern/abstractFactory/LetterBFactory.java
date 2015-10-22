package com.anson.creational.factoryPattern.abstractFactory;

import com.anson.creational.factoryPattern.extern.Letter;
import com.anson.creational.factoryPattern.extern.LetterB;

public class LetterBFactory implements LetterFactory {

	@Override
	public Letter getLetter() {
		// TODO Auto-generated method stub
		return new LetterB();
	}

}
