package com.software.basic.problem.initializer;

/**
 * 초기화 블록은 생성자와 혼동될 수 있다.
 * - 인스턴스 초기화 블록의 예
 */
public class NonStaticInitializerExample {

	private int value = -1;
	{
		value = 2;
		System.out.println("초기화 블록을 먼저 실행");
	}
	
	public NonStaticInitializerExample() { 
		System.out.println(value);
		System.out.println("생성자는 나중에 실행된다.");
	}
}
