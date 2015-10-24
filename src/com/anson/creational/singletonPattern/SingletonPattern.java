package com.anson.creational.singletonPattern;

/**
 * ����ģʽ
 * �ص㣺1�����������أ�2������洢��3����ȡ���󷽷�ͳһ
 * @author daihua
 *
 */
public class SingletonPattern {
//	���ع�����
	private SingletonPattern(){}
//	����洢
	private static SingletonPattern singleton;
//	 ͳһ���
	public static SingletonPattern getInstance(){
		if(singleton==null){
			singleton =  new SingletonPattern();
		}
		return singleton;
	}
}
