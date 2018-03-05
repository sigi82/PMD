package com.software.basic.solution.fin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 자바7의 try-with-resource를 파일 리소스에 사용한 예
 */
public class FileExample {

	public static void main(String[] args) {
		
		String path = "C:\\J2EE\\PROJECT\\java\\PMD\\test.txt";
		StringBuilder result = new StringBuilder();
		
		try(BufferedReader in = new BufferedReader(new FileReader(path))){
			
			String line = null;
			while((line = in.readLine()) != null) {
				result.append(line);
			}
			
		} catch (IOException e) {
			//catch에는 좀 더 적절한 오류 처리가 필요한다.
			System.out.println(e);
		}
	}
}
