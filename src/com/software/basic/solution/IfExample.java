package com.software.basic.solution;

/**
 * 연관된 조건문은 하나로 통합한다.
 */
public class IfExample {

	public static void main(String[] args) {
		
		int num = 7;
		
		if(num > 4 && num < 10) {
			System.out.println(num + "은 4보다 크도 10보다 작다");
		}
	}
}
