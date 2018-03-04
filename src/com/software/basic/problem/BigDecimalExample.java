package com.software.basic.problem;

import java.math.BigDecimal;

/**
 * 기본적인 BigDecimal 사용법
 */
public class BigDecimalExample {

	public static void main(String[] args) {
		
		//double을 이용해 계산할 경우 정확한 값을 계산할 수 없다.
		double dValue1 = 4.7;
		double dValue2 = 0.4;
		System.out.println("double을 이용한 값 계산의 예: " + dValue1 + " + " + dValue2 + " = " + (dValue1 + dValue2));
		
		//BigDecimal을 이용할 경우 정확한 소수점 계산 결과를 얻을 수 있다.
		BigDecimal bdValue1 = new BigDecimal("4.7");
		BigDecimal bdValue2 = BigDecimal.valueOf(0.4);
		
		//BigDecimal 계산을 할 때는 연산자가 아닌 add(더하기), subtract(빼기), multiply(곱하기), divide(나누기) 등의 메서드를 이용한다.
		System.out.println("BigDecimal을 이용한 값 계산의 예: " + bdValue1 + " + " + bdValue2 + " = " + bdValue1.add(bdValue2));
	}
}
