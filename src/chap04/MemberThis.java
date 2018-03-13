/**
this를 사용함으로써 멤버라는 것을 명시적으로 알 수 있다.
**/

public class MemberThis{
	
	private String name;
	private int number;
	
	public MemberThis(String name, int number){
		this.name = name;
		this.number = number;
		this.print();//this를 이용해서 멤버 메서드 호출
		print();//this없이 멤버 메서드 호출
	}//매개변수 있는 생성자
	
	
	public void print(){
		System.out.println("this: "+this);
		System.out.println("this.name: "+this.name);
		System.out.println("this.number: "+this.number);
	}//end member method
	
	
	
	public static void main(String[] args){
		MemberThis th = new MemberThis("홍길동",20);
	}// end main
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac MemberThis.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java MemberThis
this: MemberThis@74a14482
this.name: 홍길동
this.number: 20
this: MemberThis@74a14482
this.name: 홍길동
this.number: 20

*/