package com.software.basic.solution.string;

/**
 * 문자열에서 특정 문자 찾기
 *  - 일반적인 indexOf메서드의 다양한 사용법
 *  - 한글자를 문자열로 취급하여 indexOf로 검색하면 비효율적(쌍따옴표->홑따옴표)
 */
public class IndexOfExample {

	public static void main(String[] args) {
		
		String str = "0123456789abcdef0123456789abcdef";
		
		//다양한 indexOf 메서드 사용법의 예
		//char형 데이터는 작은따옴표로 감싸서 전달한다.
		System.out.println("문자 a는 " + str.indexOf('a') + "번째에 위치한다."); 
		System.out.println("문자열 abc는 " + str.indexOf("abc") + "번째에 위치한다.");
		System.out.println("15번째 문자 이후부터 찾은 문자 a는 " + str.indexOf('a', 15) + "번째에 위치한다.");
		System.out.println("15번째 문자 이후부터 찾은 문자열 abc는 " + str.indexOf("abc", 15) + "번째에 위치한다.");
	}
}
