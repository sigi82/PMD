package com.software.basic.solution;

import java.io.EOFException;
import java.io.FileInputStream;

/**
 * 올바른 skip 메서드 사용법
 *  - skip 메서드를 사용할때 얼마만큼 건너 뛰었는지 결과를 확인하고 원하는 범위에 도달할 때까지 skip 메서드를 다시 실행하는 방법
 */
public class SkipExample {

	private static final String DEFAULT_TXT_PATH = "C:\\J2EE\\PROJECT\\java\\PMD\\test.txt";
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream is = new FileInputStream(DEFAULT_TXT_PATH);
		
		//1024바이트 만큼 건너뛴다.
		long skipSize = 1024;
		long skipped;
		//skipSize만큼 건너뛸 때까지 반복한다.
		while(skipSize != 0) {
			skipped = is.skip(skipSize);
			if(skipped == 0) {
				throw new EOFException();
			}
			skipSize -= skipped;
		}
		
		int i;
		StringBuilder sb = new StringBuilder();
		while((i = is.read()) != -1) {
			sb.append((char)i);
		}
		is.close();
		
		System.out.println(sb.length());
	}
}
