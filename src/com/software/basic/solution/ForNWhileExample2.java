package com.software.basic.solution;

import java.util.Scanner;

/**
 * 가독성이 좋지 않은 for문의 예
 */
public class ForNWhileExample2 {

	public static void main(String[] args) {
		unreadableForExample();
	}
	
	public static void unreadableForExample() {
		String pwd = "password";
		Scanner scanner = new Scanner(System.in);
		
		//특정 조건에 따라 제어해야 하는 반복문에는 while을 사용하자
		while(true) {
			System.out.println("암호를 입력하세요: ");
			if(pwd.equals(scanner.next())) {
				System.out.println("암호 확인!");
				break;
			}
		}
		scanner.close();
	}
}
