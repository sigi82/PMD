package com.software.basic.solution.fin;

import com.software.basic.solution.fin.FinallySample;

/**
 * Finally 절에서는 return을 사용하지 않는다.
 */
public class FinallyTest {

	public static void main(String[] args) throws Exception {
		
		FinallySample sample = new FinallySample();
		
		System.out.println(sample.test()); //내부 예외처리가 묵살됨
	}	
}
