package com.software.basic.solution;

public class NullCheckExample2 {

	public static void main(String[] args) {
		//인자가 null이면 두 메서드 모두 NullPointerException이 발생한다.
		System.out.println(isEmpty(null));
		System.out.println(isEmpty2(null));
		
	}
	
	public static boolean isEmpty(String value) {
		boolean result;
		//value가 null이면 NullPointerException이 발생하며
		//value가 null이 아니면 equals가 실행되므로 value!=null은 블필요한 코드다.
		//value != null를 먼저 비교한 후에 value.equals("")를 실행하는 것이 올바른 방법이다.		
		if(value != null && !value.equals("")) {
			result = false;
		} else {
			result = true;
		}
		
		return result;
	}
	
	public static boolean isEmpty2(String value) {
		boolean result;
		//value가 null이면 NullPointerException이 발생해야 하며
		//equals는 작동하지 않아야 한다.
		//그러므로 value == null과 같은 체크는 잘못된 null 검사다.
		if(value == null || value.equals("")) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
