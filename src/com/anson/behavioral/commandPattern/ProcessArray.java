package com.anson.behavioral.commandPattern;

/**
 * 
 * 命令模式：方法在执行过程时，对指定数据或者对象进行“随机”处理。处理方式由开发者自己定义的command而定。
 * 			即：command作为一个参数，传入具体的处理过程中。spring与hibernate结合时的hibernateTemplate
 * @author daihua
 *
 */
public class ProcessArray {
	public void sum(int[] array,Command command){
		command.process(array);
	}
}
