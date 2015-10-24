package com.anson.test.behavioral.commandPattern;

import java.util.Arrays;

import org.junit.Test;

import com.anson.behavioral.commandPattern.Command;
import com.anson.behavioral.commandPattern.ProcessArray;

public class TestCommandPattern {
	@Test
	public void testCommandPattern(){
		int[] array = {1,2,3};
		ProcessArray proccessArray = new ProcessArray();
		proccessArray.sum(array, new Command(){

			@Override
			public void process(int[] array) {
				int sum = 0;
				for(int i:array){
					sum+=i;
				}
				System.out.println(Arrays.toString(array));
				System.out.println("the sum of int array is " + sum);
			}	
		});
	}
}
