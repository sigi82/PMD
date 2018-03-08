package com.software.basic.problem.string;

/**
 * 잘못된 StringBuffer/StringBuilder 초기화의 예
 */
public class WrongStringBuilderExample {

	public static void main(String[] args) {
		//StringBuilder의 최적화 를 위해 StringBuilder의 길이를 설정할 수 있지만
		//잘못된 길이, 즉 문자열이 길이보다 짧은 길이를 설정하면
		//오히려 StringBuilder의 성능이 저하된다.
		StringBuilder builderWithWrongSize = new StringBuilder(10);
		StringBuffer bufferWithWrongSize = new StringBuffer(10);
		
		//이렇게 원래 예상한 StringBuilder/StringBuffer의 길이보다 더 긴 문자열이 입력되면
		//내부 문자열 길이를 변경하는 작업이 빈번하게 발생한다.
		String tempStr = "0123456789";
		for(int i=0; i<10; i++) {
			builderWithWrongSize.append(tempStr);
			bufferWithWrongSize.append(tempStr);
		}
		
		//StringBuilder의 값을 문자 a로 설정해 등록하려는 목적으로
		//char형의 문자를 입력하면 StringBuilder는 이 문자를 ASCII 코드 값으로
		//변경해 StringBuilder의 길이로 설정한다.
		//즉, a는 ASCII 코드 값으로 97이므로
		//StringBuilder builder = new StringBuilder(97); 과 동일하다
		StringBuilder builderWithCase = new StringBuilder('a');
		StringBuffer bufferWithCase = new StringBuffer('a');
	}
}
