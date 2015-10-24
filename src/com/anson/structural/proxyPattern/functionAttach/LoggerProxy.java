package com.anson.structural.proxyPattern.functionAttach;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * �Զ���ķ�������Լ��ʱʹ�ã���spring aop 
 * @author daihua
 *
 */
public class LoggerProxy implements InvocationHandler {
	private Object target;
	public void setTarget(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(target.getClass().getName()+"."+method.getName()+ " is starting");
		Object result = method.invoke(target, args);
		System.out.println(target.getClass().getName()+"."+method.getName()+ " is ended");
		return result;
	}

}
