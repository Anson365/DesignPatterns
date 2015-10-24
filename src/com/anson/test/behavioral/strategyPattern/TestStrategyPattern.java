package com.anson.test.behavioral.strategyPattern;

import org.junit.Test;

import com.anson.behavioral.strategyPattern.LetterContext;
import com.anson.extern.LetterB;
import com.anson.extern.LetterC;

public class TestStrategyPattern {
	@Test
	public void testStrategyPattern(){
		LetterContext context1 = new LetterContext(null);
		context1.speakContext();
		LetterContext context2 = new LetterContext(new LetterB());
		context2.speakContext();
		context2.changeContext(new LetterC());
		context2.speakContext();
	}
}
