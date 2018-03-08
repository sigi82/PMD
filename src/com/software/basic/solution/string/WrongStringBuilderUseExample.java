package com.software.basic.solution.string;

/**
 * 올바른 StringBuffer와 StringBuilder 사용 예
 */
public class WrongStringBuilderUseExample {

	//가급적 StringBuffer와 StringBuilder는 클래스 멤버 변수로 사용하지 않는다.
//	private StringBuilder strBuilder = new StringBuilder();
//	private StringBuffer strBuffer = new StringBuffer();
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		//append를 연결해서 호출하는 메서드 체인이 발생하지 않도록 append를 연속해서 사용하지 않는다.
		builder.append("test");
		builder.append("<test></test>");
		builder.append("aaaa");
		
		//StringBuilder 자체의 length메서드를 사용한다.
		System.out.println("StringBuilder의 길이는 : " + builder.length());
		
		StringBuffer buffer = new StringBuffer();
		//연과된 문자열은 한번에 추가한다.
		buffer.append("Hello World");
		//StringBuffer 자체의 length 메서드를 사용한다.
		System.out.println("StringBuffer의 길이는 : " + buffer.length());
		
	}
}
