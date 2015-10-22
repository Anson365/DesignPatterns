package com.anson.test.creational.singlePattern;

import org.junit.Test;

import com.anson.creational.singletonPattern.singleton.SingletonPattern;

import junit.framework.Assert;

public class TestSingletonPattern {
	@Test
	public void testSingletonPattern(){
		SingletonPattern singleton1 = SingletonPattern.getInstance();
		SingletonPattern singleton2 = SingletonPattern.getInstance();
		Assert.assertTrue(singleton1.equals(singleton2));
	}
}
