package com.software.basic.solution;

/**
 * 잘못된 null 조건 비교
 */
public class NullCheckExample {

	public static void main(String[] args) {
		
		String a = "abcde";
		String b = null;
		
		//아래의 코드를 한줄씩 실행
		System.out.println(isNull(a));
		System.out.println(isNull(b));
		System.out.println(isNull2(a));
		System.out.println(isNull2(b));		
	}
	
	//잘못된 null 비교 메서드1
	public static boolean isNull(String value) {
		
		boolean result;
		
		//value의 값이 null이 아닐 때만 value.equals("")이 실행돼야 하는데
		//value가 null일 때 value.equals("")가 실행되어 NullPointerException이 발생한다.
		//이 같은 상황에서 올바른 논리연산자는 &&가 아닌 ||여야 한다.
		if(value == null || value.equals("")) {
			result = true;
		} else {
			result = false; 
		}
		
		return result;
	}
	
	//잘못된 null 비교 메서드2
	public static boolean isNull2(String value) {
		boolean result;
		
		//value의 값이 null이라도 value.equals("")이 실행되어
		//NullPointException이 발생한다.
		//이 같은 상황에서 올바른 논리연산자는 ||가 아니라 &&여야 한다.
		if(value != null && !value.equals("")) {
			result = false;
		} else {
			result = true;
		}
		
		return result;
	}
}
