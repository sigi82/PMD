package com.software.basic.problem;

/**
 * 연관된 조건문은 하나로 통합한다.
 */
public class IfExample {

	public static void main(String[] args) {
		//잘못된 if문 사용으로 스파케티 코드가 만들어지는 과정
		int num = 7;
		
		//최초 조건
		if(num > 4) {
			System.out.println(num + "은 4보다 크다");
		}
		
		//1차 요구사항 변경
		if(num > 4) {
			if(num < 10) {
				System.out.println(num + "은 4보다 크고 10보다 작다");
			}
		}
		
		//2차 요구사항 변경
		if(num > 4) {
			if(num < 10) {
				System.out.println(num + "은 4보다 크고 10보다 작다");
			} else if(num > 11) {
				System.out.println(num + "은 11보다 크다");
			}
		}
	}
}
