package com.software.basic.problem;

/**
 * 부정확한 부동소수점 연산의 결과
 */
public class FloatExample {

	public static void main(String[] args) {
		
		final int START = 2000000000;
		int count = 0;
		for(float f = START; f<START+50; f++) {
			count++;
		}
		
		//아래의 결과는 50을 예상했지만 0이 나옴
		System.out.println(count);
	}
}
