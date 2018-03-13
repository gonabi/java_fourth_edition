/*
Vector에서 Enumeration을 테스트하는 예
*/
package chap06;

import java.util.*;


public class EnumVectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		//Vector에 데이터 4개 삽입
		v.addElement(new String("나비1"));
		v.addElement(new String("나비2"));
		v.addElement(new String("나비3"));
		v.addElement(new String("나비4"));
		
		//Enumeration을 이용한 데이터 출력
		Enumeration<String> en = v.elements();
		
		while(en.hasMoreElements()) {//Vector에 데이터가 존재하는지 검사
			//Vector에서 데이터 추출(다운 캐스팅 필요)
			String temp = en.nextElement();
			System.out.println(temp);
		}
	}

}

/*
나비1
나비2
나비3
나비4
*/




