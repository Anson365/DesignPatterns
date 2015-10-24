package com.anson.creational.factoryPattern.abstractFactory;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;

public class LetterAFactory implements LetterFactory {

	@Override
	public Letter getLetter() {
		// TODO Auto-generated method stub
		return new LetterA();
	}

}
