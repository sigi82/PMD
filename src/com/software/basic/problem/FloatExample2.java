package com.software.basic.problem;

/**
 * float 부동소수점 연산의 문제점
 */
public class FloatExample2 {

	public static void main(String[] args) {
		//자바7에서는 아래와 같이 숫자 사이에 언더바로 자릿수를 구분할 수 있다.
		//하지만 자바7 이전에서는 적용되지 않는다.
		int value1 = 2_000_000_000;
		int value2 = 2_000_000_050;
		
		float fValue1 = 2_000_000_000;
		float fValue2 = 2_000_000_050;
		
		//int형의 value1과 value2는 다른 값이다.
		System.out.println("int형 " + value1 +"은 " + value2 + "와 " + (value1 == value2 ? "같다" : "다르다"));
		//float형의 value1과 value2는 다른 값이다.		
		System.out.println("float형 " + fValue1 +"은 " + fValue2 + "와 " + (fValue1 == fValue2 ? "같다" : "다르다"));
	}
}
