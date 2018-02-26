package com.software.basic.solution;

/**
 * 뒤죽박죽 증감변수
 */
public class LoopExample {

	public static void main(String[] args) {
		
		//문제의 현상만 해결한 방법
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		//증감변수의 이름을 단순한 문자가 아닌
		//변수 명명 규칙에 따라 작명해 혼란을 방지
		for(int perNum=2; perNum<10; perNum++) {
			for(int postNum=1; postNum<10; postNum++) {
				System.out.println(perNum + " X " + postNum + " = " + perNum*postNum);
			}
		}
		
		//기존과 같이 한 문자의 증감변수를 사용하지만
		// i와 j같이 혼동할 가능성이 있는 문자가 아닌
		// i와 k같은 문자를 사용해 혼란을 방지
		for(int i=2; i<10; i++) {
			for(int k=1; k<10; k++) {
				System.out.println(i + " X " + k + " = " + i*k);
			}
		}
		
	}
}
