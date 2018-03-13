/*
힙메모리의 개념을 이해하기 위한 예제
*/

class Top{
	public int a = 10;
	public int b = 20;
	public int c = 30;
	public int sum(){
		int d = a+b+c;
		return d;
	}
}

public class HeapMain{
	
	public static void main(String[] args){
		Top t = new Top();
		Top s = new Top();
		
		s.a = 1;
		s.b = 2;
		s.c = 3;
		
		int x = t.sum();
		int y = s.sum();
		
		System.out.println(x);
		System.out.println(y);
	}
	
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac HeapMain.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java HeapMain
60
6
*/