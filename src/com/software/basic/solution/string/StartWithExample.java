package com.software.basic.solution.string;

/**
 * indexOf, startsWith, charAt 차이점
 */
public class StartWithExample {

	public static void main(String[] args) {
		String strIndexOf = "0000UPD01";
		String strStartsWith = "UPD00001";
		String strCharAt = "U00001";
		
		//indexOf 메서드는 문자열 중 불특정 위치의 문자열을 찾을 때 유용하다
		System.out.println("UPD는 0000UPD001 문자열의 " + strIndexOf.indexOf("UPD") + "번째에 위치하고 있다.");
		
		//startsWith는 문자열의 접두사가 되는 문자열을 찾을 때 유용하다
		System.out.println("UPD는 UPD00001 문자열의 접두사다? " + strStartsWith.startsWith("UPD"));
		
		//charAt은 문자열에서 한 글자만 가져오기 때문에 문자열의 첫 문자를 찾을 때 유용하다.
		System.out.println("U는 UPD00001 문자열의 첫 글자다? " + (strCharAt.charAt(0) == 'U'));
	}
}
