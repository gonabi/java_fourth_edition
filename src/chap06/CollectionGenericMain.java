/**
컬렉션의 제너릭의 사용 여부
**/
package chap06;
import java.util.*;

public class CollectionGenericMain{
	
	
	public static void main(String[] args){
		
		//1. 이전 버전의 자바
		Vector v1 = new Vector();
		v1.add(new String("Hello World!"));
		String str1 = (String)v1.elementAt(0);
		System.out.println(str1);
		
		
		//2. 자바 5.0 이상
		Vector<String> v2 = new Vector<String>();
		v2.add(new String("Hello World"));
		String str2 = v2.elementAt(0);
		System.out.println(str2);
			
	}
}

/*
Hello World!
Hello World
*/