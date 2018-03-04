package com.software.basic.problem;

import java.math.BigInteger;

/**
 * BigInteger의 잘못된 사용법
 */
public class BigIntegerExample {
	
	//불필요한 메서드 호출과 인스턴스화가 발생한다.
	public static void main(String[] args) {
		
		BigInteger biZero = new BigInteger("0");
		
		BigInteger biOne = BigInteger.valueOf(1);
		
		BigInteger biTen;
		biTen = new BigInteger("10");
		System.out.println(biZero.intValue() + biOne.intValue() + biTen.intValue()); 
		
	}
}
