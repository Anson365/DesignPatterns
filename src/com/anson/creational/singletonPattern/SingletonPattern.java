package com.anson.creational.singletonPattern;

/**
 * 单例模式
 * 特点：1、构造器隐藏，2、对象存储，3、获取对象方法统一
 * @author daihua
 *
 */
public class SingletonPattern {
//	隐藏构造器
	private SingletonPattern(){}
//	对象存储
	private static SingletonPattern singleton;
//	 统一入口
	public static SingletonPattern getInstance(){
		if(singleton==null){
			singleton =  new SingletonPattern();
		}
		return singleton;
	}
}
