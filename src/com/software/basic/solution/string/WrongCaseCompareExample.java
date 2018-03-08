package com.software.basic.solution.string;

/**
 * 올바른 문자열 비교 방법
 */
public class WrongCaseCompareExample {

	public static void main(String[] args) {
		String value1 = "abcDEF";
		String value2 = "ABCdef";
		
		if(value1.equalsIgnoreCase(value2)) {
			System.out.println("value1 & value2는 같다");
		} else {
			System.out.println("value1 & value2는 다르다");
		}
	}
}
