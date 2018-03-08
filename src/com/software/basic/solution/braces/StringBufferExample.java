package com.software.basic.solution.braces;

public class StringBufferExample {

	public static void main(String[] args) {
		String text = "0123456789";
		StringBuffer sb = new StringBuffer();
		
		//시작 시간
		long startTime = System.currentTimeMillis();
		
		// + 연산자보다 10배 많은 연산
		for(int i = 0; i < 100000; i++) {
			sb.append(text);
		}
		
		//종료 시간
		long endTime = System.currentTimeMillis();
		
		//시간 출력
		System.out.println("## 실행시간(초.0f) : " + (endTime - startTime)/1000.0f + "초");
	}
}
