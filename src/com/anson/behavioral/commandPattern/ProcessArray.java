package com.anson.behavioral.commandPattern;

/**
 * 
 * ����ģʽ��������ִ�й���ʱ����ָ�����ݻ��߶�����С��������������ʽ�ɿ������Լ������command������
 * 			����command��Ϊһ���������������Ĵ�������С�spring��hibernate���ʱ��hibernateTemplate
 * @author daihua
 *
 */
public class ProcessArray {
	public void sum(int[] array,Command command){
		command.process(array);
	}
}
