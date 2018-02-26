package com.software.basic.problem;

import java.util.Scanner;

/**
 * 일반적인 for문과 while문의 사용법
 */
public class ForNWhileExample {

	public static void main(String[] args) {
		forExample();
		whileExample();
	}
	
	/**
	 * 일반적인 for문의 예
	 */
	public static void forExample() {
		//범위가 정해진 반복문에는 for를 사용하자
		for(int i=1; i<10; i++) {
			System.out.println("2 X " + i + " = " + 2*i);
		}
	}
	
	/**
	 * 일반적인 while문의 예
	 */
	public static void whileExample() {
		String pwd = "password";
		Scanner scanner = new Scanner(System.in);
		
		//특정조건에 따라 제어해야 하는 반복문에는 while을 사용하자
		while(true) {
			System.out.println("암호를 입력하세요: ");
			if(pwd.equals(scanner.next())) {
				System.out.println("암호 확인됨!");
				break;
			}
		}
		scanner.close();
	}
}
