package com.software.basic.problem;

/**
 * Boolean 값을 반환하는 코드는 단순하게
 *  - if문을 이용해 boolean 값을 반환
 */
public class SimplifyBooleanReturnsExample {

	public static void main(String[] args) {
		
		System.out.println(isEvenNumber(2));
	}
	
	public static boolean isEvenNumber(int value) {
		if(value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
