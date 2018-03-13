/**
this의 의미를 테스트하기 위한 예제
**/

class TopThis{
	public void printSelf(){
		System.out.println(this);// 클래스 내에서 this 사용
	}
}


public class TopThisMain{
	
	public static void main(String[] args){
		TopThis t1 = new TopThis();//객체의 메모리 생성
		System.out.println("t1객체:"+t1);
		t1.printSelf(); //메모리가 생성된 후 this 출력

		TopThis t2 = new TopThis();//객체의 메모리 생성
		System.out.println("t2객체:"+t2);
		t2.printSelf(); //메모리가 생성된 후 this 출력
		
		
		
		
	}//end main
}


/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac TopThisMain.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java TopThisMain
t1객체:TopThis@74a14482
TopThis@74a14482
t2객체:TopThis@1540e19d
TopThis@1540e19d

this의 특징
this는 멤버 메서드에 추가되는 가상의 매개변수이기 때문에 메서드 내에서만 사용할 수 있다.
*/