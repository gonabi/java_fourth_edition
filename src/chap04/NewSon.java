/*
super 키워드를 이용한 상위 클래스의 메서드 접근
*/


class NewFather{
	public void sayHello(){
		System.out.println("NewFather의 sayHello()");	
	}
}



public class NewSon extends NewFather{
	
	public void sayHello(){
		System.out.println("NewSon의 sayHello()");	
	}// overriding
	
	
	//만약 super 키워드를 사용하지 않는다면 하위 클래스의 sayHello가 호출된다.
	public void test(){
		super.sayHello();//하위 클래스 내에서 상위 클래스의 sayHello() 호출
	}
	
	
	
	public static void main(String[] args){
		
		NewSon s = new NewSon();
		s.sayHello(); //NewSon이 재정의 했기 때문에 NewSon의 sayHello() 호출
		s.test();//super를 이용해서 상위 클래스의 sayHello() 호출
		
		
	}// end main
}
/*

Gonabiui-MacBook-Pro:chap04 gonabi$ javac NewSon.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java NewSon
NewSon의 sayHello()
NewFather의 sayHello()
*/