/*
 Hashtable을 테스트하는 예제 
 */
package chap06;

import java.util.Hashtable;

public class HashtableMain {

	public static void main(String[] args) {
		Hashtable<String,Object> h = new Hashtable<String,Object>();
		
		//Hashtable에 키와 데이터의 삽입
		h.put("Name", new String("고나비"));
		h.put("Age", new Integer(27));
		h.put("Tel", new String("01-111-1111"));
		h.put("Cellphone", new String("017-777-7777"));
		h.put("Etc",new String("I am a cat"));
		
		
		//키 값을 이용해서 객체 추출
		String name = (String) h.get("Name");
		System.out.println("Name="+name);
		
		Integer age = (Integer) h.get("Age");
		System.out.println("Age="+age);
		
		System.out.println("Age="+age.intValue());
		
	}

}

/*
Name=고나비
Age=27
Age=27
 */


