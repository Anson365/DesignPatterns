package com.anson.creational.factoryPattern.abstractFactory;

import com.anson.creational.factoryPattern.extern.Letter;

/**
 * 抽象工厂模式：为每个类，设置一个工厂
 * @author daihua
 *
 */
public interface LetterFactory {
	public Letter getLetter();
}
