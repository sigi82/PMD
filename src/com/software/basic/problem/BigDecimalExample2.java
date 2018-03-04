package com.software.basic.problem;

import java.math.BigDecimal;

/**
 * 정수와 실수로 BigDecimal을 생성한 예
 */
public class BigDecimalExample2 {

	public static void main(String[] args) {
		
		//정수값을 이용한 선언
		BigDecimal bdValue1 = new BigDecimal(12);
		
		//실수값을 이용한 선언
		BigDecimal bdValue2 = new BigDecimal(1.123);
		
		System.out.println("bdValue1: " + bdValue1);
		System.out.println("bdValue2: " + bdValue2);
	}
}
