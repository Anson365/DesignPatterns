package com.anson.structural.proxyPattern.delayLoader;

import com.anson.extern.Letter;
import com.anson.extern.LetterA;

/**
 * ��ָ����������ӳټ��أ���������Ҫʹ�����������Ի��߷���ʱ���Ŷ�����г�ʼ������ʡ��Դ
 * @author daihua
 *
 */
public class DelayLoader implements Letter {
	private Letter target;
	//�˴�Ϊ������ԡ�����getter��setter
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
			this.target = new LetterA(); //�˴�����LetterA
		}
		target.speak();
	}
	
}
