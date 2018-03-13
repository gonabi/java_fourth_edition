/**
Advanced for문 (for each문)의 사용
**/

import java.util.*;

public class ForEachMain{
	
	public static void main(String[] args){
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("hello1");
		ar.add("hello2");
		ar.add("hello3");
		
		//1. 일반적인 For 문
		for(Iterator<String> i = ar.iterator(); i.hasNext();){
			String tmp = i.next();
			System.out.println(tmp);
		}
		
		System.out.println();
		
		//2. For Each문 J2SE 5.0의 코드
		for( String tmp:ar ){
			System.out.println(tmp);
		}
		
		
	}// end main()
}

/*
hello1
hello2
hello3

hello1
hello2
hello3
*/