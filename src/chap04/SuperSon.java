/**
super를 이용한 상위 클래스의 생성자 호출	
**/

class SuperFather{
	private String name;
	
	public SuperFather(String name){
		this.name = name;
		System.out.println("SuperFather 의 생성자 호출");
	}//매개변수있는 생성자 메서드
}



public class SuperSon extends SuperFather{
	
	public SuperSon(String str){
		super(str);//super를 이용한 상위 클래스의 생성자 호출
		System.out.println("SuperSon의 생성자 호출");
	}//생성자
	
	
	public static void main(String[] args){
		SuperSon s = new SuperSon("홍길동");
	}// end main
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac SuperSon.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java SuperSon
SuperFather 의 생성자 호출
SuperSon의 생성자 호출	
	
*/