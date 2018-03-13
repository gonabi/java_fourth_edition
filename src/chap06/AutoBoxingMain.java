/**
AutoBoxing과 UnAutoBoxing을 테스트하는 예제		
**/

import java.util.Vector;

public class AutoBoxingMain{
	
	public static void main(String[] args){
		
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(100);//AutoBoxing 발생
		v.addElement(200);//AutoBoxing 발생
		
		int a0 = v.elementAt(0);//AutoUnBoxing 발생
		int a1 = v.elementAt(1);//AutoUnBoxing 발생
		
		System.out.println("index 0: "+a0);
		System.out.println("index 1: "+a1);
	}
	
}

/*
Gonabiui-MacBook-Pro:chap06 gonabi$ javac AutoBoxingMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java AutoBoxingMain
index 0: 100
index 1: 200

v.elementAt(0)에서 리턴되는 것은 Integer형의 객체이다. Integer형의 객체를 int형에 할당했을 때 자동으로
Integer 형의 객체가 int형으로 형변환된다. 
이 기능은 자바 5.0 이후 버전부터 지원해주는 기능이니 주의해서 사용하기 바란다.

*/