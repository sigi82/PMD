package com.software.basic.solution;

/**
 * 분기문을 적절한 위치에 둔 예
 */
public class BranchingExample {

	public static void main(String[] args) {
		
		//제어문과 countinue를 이용해 0~10 범위의 홀수를 출력
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				//continue문이 실행되면 continue문 아래의 코드는 모두 실행하지 않는다.
				continue;
			}
			System.out.println(i);
		}
		
		//제어문과 break문을 이용해 반복문을 종료하는 예
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
				break;
			}
		}
		
		//제어문과 return 문을 이용해 반복문과 메서드를 종료하는 예
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
				return;
			}
		}
		
	}
}
