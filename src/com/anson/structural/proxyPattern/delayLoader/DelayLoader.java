package com.anson.structural.proxyPattern.delayLoader;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;

/**
 * 对指定对象进行延迟加载，在正在需要使用其内置属性或者方法时方才对其进行初始化，节省资源
 * @author daihua
 *
 */
public class DelayLoader implements Letter {
	private Letter target;
	//此处为方便测试、增加getter与setter
	public Letter getTarget() {
		return target;
	}
	public void setTarget(Letter target) {
		this.target = target;
	}
	public DelayLoader(Letter target){
		this.target = target;
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		if(target==null){
			this.target = new LetterA(); //此处代理LetterA
		}
		target.speak();
	}
	
}
