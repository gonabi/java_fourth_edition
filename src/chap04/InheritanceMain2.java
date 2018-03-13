/**
최하위 클래스의 객체로 상위 클래스들의 멤버 메서드를 호출하는 예	
**/

public class InheritanceMain2{
	
	public static void main(String[] args){
		Child c = new Child();//Child객체 생성
		c.sayGrandNumber();
		c.sayFatherNumber();
		c.sayChildNumber();		
	}//end main
}


/*
I am a GrandFather
I am a Father
I am a child
sayGrandNumber() 메서드 호출
0 1 2 3 4 5 6 7 8 9 
sayFatherNumber() 메서드 호출
10 11 12 13 14 15 16 17 18 19 
sayChildNumber() 메서드 호출
20 21 22 23 24 25 26 27 28 29 	
	
*/