/*
생성자의 오버로딩의 개념을 테스트하는 예제	
*/

public class DirectCons{
	
	private String name = null;
	private String address = null;
	private int age = 0;
	
	//매개변수 없는 생성자, 생성자는 리턴 타입이 없게 작성하는 것이다.
	public DirectCons(){
		name = "이름없음";//멤버변수 초기화
		address = "주소없음";//멤버변수 초기화
		age = 0;//멤버변수 초기화
	}
	
	//매개변수 있는 생성자
	public DirectCons(String n, String a, int g){
		name = n;
		address = a;
		age = g;
	}	
	
	
	public String getData(){
		return name+","+address+","+age;
	}
	
	
	public static void main(String[] args){
		//1. 매개변수 없는 생성자의 사용
		DirectCons dc1 = new DirectCons();
		String s1 = dc1.getData();
		System.out.println(s1);
		
		//2. 매개변수 있는 생성자의 사용
		DirectCons dc2 = new DirectCons("홍길동","서울시 중구",25);
		String s2 = dc2.getData();
		System.out.println(s2);
		
		
		
		
	}// end main
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac DirectCons.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java DirectCons
이름없음,주소없음,0
홍길동,서울시 중구,25
*/