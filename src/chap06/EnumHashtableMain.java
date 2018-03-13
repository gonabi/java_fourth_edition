/**
Hashtable에서 Enumeration을 테스트하는 예	
**/

import java.util.*;

public class EnumHashtableMain{
	
	public static void main(String[] args){
		
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("1", new String("나비"));
		h.put("2", new String("야옹!"));
		h.put("3", new String("02-000-0000"));
		h.put("4", new String("017-777-9999"));
		
		Enumeration<String> en = h.elements();
		
		while(en.hasMoreElements()){ //데이터 존재 여부 확인
			//데이터를 얻기(다운캐스팅 필요)
			String temp = en.nextElement();
			System.out.println(temp);
			
		}
		
		Enumeration<String> en2 = h.keys();
		while(en2.hasMoreElements()){//데이터 존재 여부 확인
			String temp = en2.nextElement();
			System.out.println(temp);
		}
		
		
	}
}

/*
017-777-9999
02-000-0000
야옹!
나비
4
3
2
1
*/