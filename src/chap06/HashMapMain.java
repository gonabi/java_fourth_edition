/**
HashMap 클래스의 사용
**/

package chap06;
import java.util.*;

public class HashMapMain{
	
	public static void main(String args[]){
		Map<String,Integer> map = new HashMap<String, Integer>();	
		
		map.put("고나비1",new Integer(1));
		map.put("고나비2",new Integer(2));
		map.put("고나비3",new Integer(3));
		map.put("고나비4",new Integer(4));
		map.put("고나비5",new Integer(5));
		
		System.out.println(map.get("고나비1"));
		System.out.println(map.get("고나비2"));
		System.out.println(map.get("고나비3"));
		System.out.println(map.get("고나비4"));
		System.out.println(map.get("고나비5"));
		
		
	}
}


/*
데이터를 추출할 때에는 get() 메서드와 키를 이용해서 추출할 수 있다.	
	
1
2
3
4
5
키를 이용해서 쉽게 검색하고자 한다면 HashMap을 이용하면 된다.
*/