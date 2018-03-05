package com.software.basic.solution;

/**
 * Boolean 값을 반환하는 코드는 단순하게
 *  - 반복된 boolean 값 비교를 제거하고 직접 반환
 */
public class SimplifyBooleanReturnsExample {

	public static void main(String[] args) {
		
		System.out.println(isEvenNumber(2));
	}
	
	public static boolean isEvenNumber(int value) {
		return value % 2 == 0;
	}
}
