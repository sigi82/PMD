package com.software.basic.solution.string;

/**
 * 빈 문자열 확인
 *  - isWhitespace 메서드를 이용한 빈 문자열 확인
 */
public class EmptyStringExample {

	public static void main(String[] args) {
		String emptyString = " ";
		
		if(isBlank(emptyString)) {
			System.out.println("emptyString은 비어있다.");
		} else {
			System.out.println("emptyString은 비어있지 않다.");
		}
	}
	
	//isWhitespace를 활용하면 불필요한 인스턴스 생성을 피하고 더욱 정확한 공백문자를 확인
	public static boolean isBlank(final String str) {
		int strLen;
		boolean result = true;
		if(str == null || str.length() == 0) {
			result = true;
		} else {
			strLen = str.length();
			for(int i=0; i<strLen; i++) {
				if(!Character.isWhitespace(str.charAt(i))) {
					result = false;
					break;
				}
			}
		}		
		return result;
	}
}
