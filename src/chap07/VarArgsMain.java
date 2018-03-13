//컬렉션과 가변배열의 차이
package chap07;

import java.util.*;

public class VarArgsMain {
	
	public static void display(Vector v) {
		for(Object s : v) {
			System.out.println("컬렉션형태:"+s);
		}
		System.out.println();
	}
	
	
	
	
	public static void display(String... strs) {
		for(String s : strs) {
			System.out.println("가변배열형태:"+s);
		}
	}
	
	
	
	public static void main(String[] args) {
		//1. 컬렉션을 이용한 매개변수
		Vector vec = new Vector();
		vec.add("Hello");
		vec.add("World");
		vec.add("Korea");
		VarArgsMain.display(vec);
		
		//2. 가변배열을 이용한 매개변수
		VarArgsMain.display("Hello","World","Gonabi");

	}

}
/*
컬렉션형태:Hello
컬렉션형태:World
컬렉션형태:Korea

가변배열형태:Hello
가변배열형태:World
가변배열형태:Gonabi
*/