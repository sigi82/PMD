package com.software.basic.solution;

import java.math.BigInteger;

/**
 * 올바른 BigInteger 사용법
 */
public class BigIntegerExample {

	public static void main(String[] args) {
		
		//불필요한 인스턴스를 만들지 말고 이미 정의돼 있는 값을 활용
		BigInteger biZero = BigInteger.ZERO;
		BigInteger biOne = BigInteger.ONE;
		BigInteger biTen = BigInteger.TEN;
		
		//정의되지 않은 값은 다음과 같은 방법으로 정의하면 된다.
		BigInteger biTest1 = new BigInteger("10000000");
		BigInteger biTest2 = BigInteger.valueOf(20000000);
		
		System.out.println(biZero.intValue() + biOne.intValue() + biTest1.intValue() + biTest2.intValue());
	}
}
