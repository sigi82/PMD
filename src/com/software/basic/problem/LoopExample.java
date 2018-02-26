package com.software.basic.problem;

/**
 * 뒤죽박죽 증감변수
 */
public class LoopExample {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			//아래의 코드를 자세히 보자
			for(int j=1; j<10; i++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
	}
}
