package com.software.basic.problem;

import java.io.FileInputStream;

/**
 * 잘못된 skip 메서드 사용법
 */
public class SkipExample {

	private static final String DEFAULT_TXT_PATH = "C:\\J2EE\\PROJECT\\java\\PMD\\test.txt";
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream is = new FileInputStream(DEFAULT_TXT_PATH);
		
		//1024바이트 만큼 건너뛴다.
		is.skip(1024);
		
		int i;
		StringBuilder sb = new StringBuilder();
		while((i = is.read()) != -1) {
			sb.append((char)i);
		}
		is.close();
		
		System.out.println(sb.length());
	}
}
