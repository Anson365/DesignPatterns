package com.anson.test.structural.proxyPattern;

import java.lang.reflect.Proxy;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.anson.creational.factoryPattern.simpleFactory.SimpleFactory;
import com.anson.extern.Letter;
import com.anson.structural.proxyPattern.delayLoader.DelayLoader;
import com.anson.structural.proxyPattern.functionAttach.LoggerProxy;

public class TestProxyPattern {
	private String type;
	
	@Before
	public void before(){
		String[] array = {"A","B","C"};
		Random random = new Random();
		type = array[random.nextInt(100)%3];
	}
	@Ignore
	public void testFunctionProxyPattern(){
		Letter target = SimpleFactory.createObject(type);
		System.out.println(target.getClass().getName());
		LoggerProxy proxy = new LoggerProxy();
		proxy.setTarget(target);
		Letter action = (Letter)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), proxy);
		action.speak();
	}
	
	@Test
	public void testDelayLoadProxyPattern(){
		DelayLoader proxy = new DelayLoader(null);
		System.out.println(proxy.getTarget());
		proxy.speak();
		System.out.println(proxy.getTarget());
	}
}
