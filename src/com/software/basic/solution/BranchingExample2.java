package com.software.basic.solution;

/**
 * 잘못 조합된 분기문을 정리한 예
 */
public class BranchingExample2 {

	public static void main(String[] args) {
		
		int result = 0;
		for(int i=0; i<10; i++) {
			if(i*i > 25) {
				result = i*i;
				break;
			}
		}
		
		System.out.println("결과: " + result);
	}
}
