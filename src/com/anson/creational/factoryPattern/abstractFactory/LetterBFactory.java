package com.anson.creational.factoryPattern.abstractFactory;

import com.anson.extern.Letter;
import com.anson.extern.LetterB;

public class LetterBFactory implements LetterFactory {

	@Override
	public Letter getLetter() {
		// TODO Auto-generated method stub
		return new LetterB();
	}

}
