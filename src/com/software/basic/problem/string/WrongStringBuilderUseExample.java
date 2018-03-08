package com.software.basic.problem.string;

/**
 * 잘못된 StringBuffer/StringBuilder 객체의 사용 예
 */
public class WrongStringBuilderUseExample {

	//StringBuffer와 StringBuilder를 클래스 멤버 변수로 사용하면
	//장시간 클래스 인스턴스가 생존할수록 메모리 누수의 가능성도 높아진다.
	private StringBuilder strBuilder = new StringBuilder();
	private StringBuffer strBuffer = new StringBuffer();
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		//append를 연결해서 사용하면 메서드 체인이 발생해 메모리 누수가 발생할 가능성이 있다.
		builder.append("abc").append("def").append("123");
		
		//StringBuilder에서도 자체적인 length 메서드를 제공한다.
		//toString은 불필요한 인스턴스만 생성한다.
		System.out.println("StringBuilder의 길이는 : " + builder.toString().length());
		
		StringBuffer buffer = new StringBuffer();
		//append를 연결해서 사용하면 메서드 체인이 발생해서 메모리 누수가 발생할 가능성이 있다.
		buffer.append("<xml>").append("<head>").append("").append("</head>").append("...");
		
		//연관된 문자열을 분리해서 입력하는 것은 비효율적이다.
		buffer.append("Hello").append(" ").append("World");
		
	}
}
