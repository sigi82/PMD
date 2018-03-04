package com.software.basic.solution;

import java.math.BigDecimal;

/**
 * 올바른 BigDecimal 객체의 생성 방법
 */
public class BigDecimalExample2 {

	public static void main(String[] args) {
		
		//자연수를 이용한 선언
		BigDecimal bdValue1 = BigDecimal.valueOf(1.123);
		BigDecimal bdValue2 = new BigDecimal("1.123");
		
		System.out.println("bdValue1: " + bdValue1);
		System.out.println("bdValue2: " + bdValue2);
	}
}
