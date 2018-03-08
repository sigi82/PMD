package com.software.basic.problem.string;

/**
 * 문자열의 시작 문자를 검사할 때는 startWith가 아닌 chartAt을 활용하자
 */
public class StartWithExample {
	
	public static void main(String[] args) {
		
		StartWithExample example = new StartWithExample();
		
		//2글자 이상 비교시(startWith 추천) 
		example.doStartWith("UPD00001", "UPD");
		example.doIndexOf("UPD00001", "UPD");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//1글자 비교시(charAt 추천)
		example.doStartWith("U00001", "U");
		example.doIndexOf("U00001", "U");		
		example.doCharAt("U00001", 'U');
	}
	
	public void doStartWith(String str1, String str2) {
		
		
		//시작 시간
		long startTime = System.currentTimeMillis();
		//startWith 메서드로 접두사를 100만 번 비교
		for(int i=0; i<10000000; i++) {
			if(str1.startsWith(str2)) {
//				System.out.println("상품 정보를 수정합니다.");
			}
		}
		//종료 시간
		long endTime = System.currentTimeMillis();
		
		//시간 출력
		System.out.println("##startWith 실행시간(초.0f) : " + (endTime - startTime)/1000.0f + "초");
	}
	
	public void doIndexOf(String str1, String str2) {
		
		
		//시작 시간
		long startTime = System.currentTimeMillis();
		//startWith 메서드로 접두사를 100만 번 비교
		for(int i=0; i<10000000; i++) {
			if(str1.indexOf(str2) == 0) {
//				System.out.println("상품 정보를 수정합니다.");
			}
		}
		//종료 시간
		long endTime = System.currentTimeMillis();
		
		//시간 출력
		System.out.println("##indexOf 실행시간(초.0f) : " + (endTime - startTime)/1000.0f + "초");
	}
	
	public void doCharAt(String str, char chr) {
		
		//시작 시간
		long startTime = System.currentTimeMillis();
		//startWith 메서드로 접두사를 100만 번 비교
		for(int i=0; i<10000000; i++) {
			if(str.charAt(0) == chr) {
//				System.out.println("상품 정보를 수정합니다.");
			}
		}
		//종료 시간
		long endTime = System.currentTimeMillis();
		
		//시간 출력
		System.out.println("##charAt 실행시간(초.0f) : " + (endTime - startTime)/1000.0f + "초");		
	}
}
