package com.software.basic.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * List에서 배열로 변환하는 일반적인 방법
 */
public class ToArrayExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		String[] array1	= new String[list.size()];
		
		//1. 느리고 불필요한 코드가 존재
		for(int i=0; i<list.size(); i++) {
			array1[i] = list.get(i);
		}
		
		//2. new String[0]의 크기가 0이라서 내부적으로 불필요한 객체를 생성해야 한다.
		String[] array2 = (String[])list.toArray(new String[0]);
		
		//3. java.lang.ClassCastException 예외가 발생한다.
		String[] array3 = (String[])list.toArray();
	}
}
