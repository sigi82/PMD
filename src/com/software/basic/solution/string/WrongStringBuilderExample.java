package com.software.basic.solution.string;

/**
 * 올바른 StringBuffer와 StringBuilder 객체의 생성자 사용
 */
public class WrongStringBuilderExample {

	public static void main(String[] args) {
		
		//StringBuilder/StringBuffer의 길이는 필요한 만큼 충분히 설정
		StringBuilder builderWithSize = new StringBuilder(100);
		StringBuffer bufferWithSize = new StringBuffer(100);
		
		String tempStr = "0123456789";
		
		for(int i=0; i<10; i++) {
			builderWithSize.append(tempStr);
			bufferWithSize.append(tempStr);
		}
		
		//StringBuffer/StringBuilder를 문자가 아닌 문자열로 초기화
		StringBuilder builderWithChar = new StringBuilder("a");
		StringBuffer bufferWithChar = new StringBuffer("A");
		
		System.out.println(builderWithChar.toString());
		System.out.println(bufferWithChar.toString());
	}
}
