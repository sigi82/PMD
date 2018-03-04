package com.software.basic.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 올바른 toArray 메서드 사용방법
 */
public class ToArrayExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		//아래와 같이 대상 배열의 자료형과 정확한 길이를 전달한다.
		String[] array3 = (String[])list.toArray(new String[list.size()]);
		for(String value : array3) {
			System.out.println(value);
		}
	}
}
