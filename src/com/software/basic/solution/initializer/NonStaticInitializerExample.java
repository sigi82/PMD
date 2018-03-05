package com.software.basic.solution.initializer;

/**
 * 초기화 블록은 생성자와 혼동될 수 있다.
 *  - 여러 생성자에 공통적인 절차를 초기화 블록으로 위임한 예
 */
public class NonStaticInitializerExample {

	private int value;
	private String str;
	private Integer num;
	{
		value = 2;
		System.out.println("초기화 블록 먼저 실행");
	}
	
	public NonStaticInitializerExample() {
		System.out.println(value);
	}
	
	public NonStaticInitializerExample(String str) {
		this.str = str;
		System.out.println(Integer.parseInt(this.str) - value);
	}
	
	public NonStaticInitializerExample(Integer num) {
		this.num = num;
		System.out.println(num - value);
	}
}
