/**
HashSet 클래스의 사용	
**/
import java.util.*;

public class HashSetMain{
	public static void main(String[] args){
		Set<String> set = new HashSet<String>();
		set.add("abc0");
		set.add("abc1");
		set.add("abc2");
		set.add("abc3");
		set.add("abc4");
		System.out.println("HashSet: "+set);
		set.remove("abc0");
		System.out.println(set.contains("abc1"));
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			System.out.println(temp+",");
		}
		
	}
}
/*
HashSet에서 데이터를 추출하기 위해서는 다음과 같이 Iterator를 이용하면 된다.
Iterator는 컬렉션 내의 모든 데이터에 접근할 수 있는 특징이 있으며, 데이터의 마지막에 상관하지 않고
검색하기 위한 인터페이스이다. Set의 Iterator() 메서드로 Iterator를 얻어 낼 수 있으며, Iterator의
hasNext()를 이용해서 데이터 끝을 만날 때까지 next() 메서드를 호출해서 데이터를 추출하고 있다.

Gonabiui-MacBook-Pro:chap06 gonabi$ javac HashSetMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java HashSetMain
HashSet: [abc1, abc0, abc3, abc2, abc4]
true
abc1,
abc0,
abc2,
abc4,
*/