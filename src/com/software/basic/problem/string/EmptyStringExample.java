package com.software.basic.problem.string;

/**
 * 빈 문자열 확인
 *  - trim 메서드를 이용한 빈 문자열 확인
 */
public class EmptyStringExample {

	public static void main(String[] args) {
		String emptyString = "";
		
		//trim과 length메서드를 이용한 방식은 불필요한 인스턴스가 생성될뿐더러
		//isWhiteSpace메서드보다 정확도가 떨어진다.
		if(emptyString.trim().length() == 0) {
			System.out.println("emptyString은 비어있다.");
		} else {
			System.out.println("emptyString은 비어있지 않다.");
		}
	}
	
}
