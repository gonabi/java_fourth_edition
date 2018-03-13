/*
ArrayList 클래스의 사용	
*/
import java.util.*;

public class ArrayListMain{
	
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc0");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		System.out.println(list);
		System.out.println("Index 2:"+list.get(2));
		System.out.println("Index 0:"+list.get(0));
		
		
		String[] arList = new String[list.size()];
		list.toArray(arList);
		System.out.println("Index 1:"+list.get(1));
		System.out.println("Index 3:"+list.get(3));
		
		
	}
}

/*

Gonabiui-MacBook-Pro:chap06 gonabi$ javac ArrayListMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java ArrayListMain
[abc0, abc1, abc2, abc3, abc4]
Index 2:abc2
Index 0:abc0
Index 1:abc1
Index 3:abc3
*/