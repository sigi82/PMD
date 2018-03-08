package com.software.basic.problem.braces;

/**
 * for와 while문의 괄호 규칙
 */
public class LoopExample {

	public static void main(String[] args) {
		int size = 0;
		for(int i = 0; i < 10; i++)
			size++;
		
		while(size < 20)
			size++;
	}
}
