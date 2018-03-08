package com.software.basic.solution.braces;

/**
 * if문 괄호 규칙
 */
public class IfExample {

	public static void main(String[] args) {
		
		int size = 0;
		//단 한 줄의 코드라도 괄호로 처리한다.
		if(size != 0) {
			size++;
		}
		size++;
		
		if(size < 2) {
			size++;
		} else { //단 한 줄의 코드라도 괄호를 처리한다.
			size++;
		}
		size++;
	}
}
