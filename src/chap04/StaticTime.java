/**
	스태틱 변수의 접근을 테스트하는 예제	
**/

public class StaticTime{
	
	public static int special = 2000;
	
	public static void main(String[] args){
		// 객체 생성 이전에 클래스 이름으로 스태틱에 접근할 수 있다.
		System.out.println("객체 생성 이전 접근 StaticTime.special: "+StaticTime.special);
		
		//객체의 이름을 이용해서 스태틱에 접근할 수 있다.
		StaticTime s = new StaticTime();
		s.special = 4000;
		
		System.out.println("객체 생성 후 접근 s.special: "+s.special);
		System.out.println("객체 생성 후 접근 StaticTime.special: "+StaticTime.special);
		
	}//end main()
	
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac StaticTime.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java StaticTime
객체 생성 이전 접근 StaticTime.special: 2000
객체 생성 후 접근 s.special: 4000
객체 생성 후 접근 StaticTime.special: 4000

4.2.8 스태틱 메모리가 생성되는 시기
스태틱의 메모리 생성 시기에 대한 질문
일반 멤버 변수는 new 연산자를 이용해서 메모리를 생성할 때 만들어진다.
new할 때마다 일반 멤버 변수의 메모리는 만들어지지만 static 메모리는 딱 한번 만들어진다.
그렇다면 스태틱 멤버는 어느 시점에 메모리가 만들어질까?
처음 new할 때 만들어질까? 아니다. 그럼 언제 메모리가 만들어질까? 이것의 해답은 클래스의 이름만 언급되어도 만들어진다이다.
*/
