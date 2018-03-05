package com.software.basic.solution.fin;

/**
 * Finally 절에서는 return을 사용하지 않는다.
 */
public class FinallySample {

	public String test() throws Exception{
		try {
			throw new Exception("예외 발생");
		} catch(Exception e) {
			throw e;
		} 
	}
}
