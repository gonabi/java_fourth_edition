/**
Vector와 Hashtable에서 Iterator를 테스트하는 예제
**/

import java.util.*;

public class IteratorMain{
	
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>();
		
		//Vector에 객체 삽입
		v.addElement(new String("나비1"));
		v.addElement(new String("나비2"));
		v.addElement(new String("나비3"));
		v.addElement(new String("나비4"));
		
		//Iterator를 이용한 데이터 출력
		Iterator<String> iter = v.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			System.out.println(temp);
		}
		System.out.println();
		
		Hashtable<String,String> h = new Hashtable<String,String>();
		
		//Hashtable에 객체 삽입
		h.put("1", new String("돌이1"));
		h.put("2", new String("야옹!"));
		h.put("3", new String("02-1111-2222"));
		h.put("4", new String("017-777-9999"));
		
		//Iterator를 이용한 데이터 출력
		Iterator<String> iter2 = h.values().iterator();
		while(iter2.hasNext()){
			String temp = iter2.next();
			System.out.println(temp);
		}
		
		
	}// end main()
	
}

/*
Gonabiui-MacBook-Pro:chap06 gonabi$ javac IteratorMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java IteratorMain
나비1
나비2
나비3
나비4

017-777-9999
02-1111-2222
야옹!
돌이1
*/