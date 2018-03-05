package com.software.basic.problem;

/**
 * Double.NaN으로 값을 비교하지 않는다.
 */
public class BadComparisonExample {

	public static void main(String[] args) {
		
		//어떠한 이유로 숫자가 아닌 값(NaN; Not a Number)을 할당
		Double errorValue = Double.NaN;
		
		//오류를 검증하기 위해 오류 값을 Double.NaN과 비교
		if(errorValue == Double.NaN) {
			System.out.println("오류 발생");
		} else {
			System.out.println("정상 처리");
		}
	}
}
