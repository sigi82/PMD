package com.software.basic.solution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * java.util.Properties를 이용한 IP 설정
 */
public class IPExample {
	
	//프로퍼티 파일의 경로
	private static final String DEFAULT_PROPERTIES_PATH = "D:\\Dev\\J2EE\\PROJECT\\java\\PMD\\test.properties";
	
	private static String serverIP;
	
	public static String getServerIP() {
		return serverIP;
	}
	public static void setServerIP(String serverIP) {
		IPExample.serverIP = serverIP;
	}
	
	/**
	 * 프로퍼티 키로 값을 불러온다.
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String getKey(String key) throws Exception {
		
		//프로퍼티의 값은 아래와 같이 클래스로더를 이용해 상대 주소로 불러올 수 있다.
		//ClassLoader.getSystemResourceAsStream("com.software.basic.solution.resources.test.properties");
		
		String value = null;
		InputStream is = new FileInputStream(DEFAULT_PROPERTIES_PATH);
		Properties properties = null;
		try {
			properties = new Properties();
			properties.load(is);
			value = properties.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {is.close();} catch(IOException e) {}
		}
		return value;
	}
	
	public static void main(String[] args) throws Exception {
		setServerIP(IPExample.getKey("serverIP"));
		System.out.println("SERVER IP : " + getServerIP());
	}
}
