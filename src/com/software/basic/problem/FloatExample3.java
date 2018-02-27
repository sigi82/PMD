package com.software.basic.problem;

/**
 * 부정확한 부동소수점 연산의 결과
 * - float, double은 정확한 값이 아닌 근사치를 계산
 * - 비록 속도가 느려도 BigDecimal을 사용
 */
public class FloatExample3 {

	public static void main(String[] args) {
		
		double total = 0;
		total += 4.7;
		total += 0.4;
		
		System.out.println(total); //5.1을 예상했지만 다른 근사값이 나온다.
	}
}
