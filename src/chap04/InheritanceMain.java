/*
하위 클래스의 객체로 상위 클래스의 메서드를 호출하는 예	
*/

public class InheritanceMain{
	
	
	public static void main(String[] args){
		//Father.java각 같은 폴더에 위치해서 호출할 수 있다.
		Father f = new Father(); //Father 객체의 생성
		f.sayGrandNumber(); //Father의 객체를 이용해서 GrandFather의 메서드 호출
		f.sayFatherNumber(); //Father의 객체로 Father의 메서드 호출
		
	}// end main
}

/*



Gonabiui-MacBook-Pro:chap04 gonabi$ javac GrandFather.java
Gonabiui-MacBook-Pro:chap04 gonabi$ javac Father.java
Gonabiui-MacBook-Pro:chap04 gonabi$ javac InheritanceMain.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java InheritanceMain
I am a GrandFather
I am a Father
sayGrandNumber() 메서드 호출
0 1 2 3 4 5 6 7 8 9 
sayFatherNumber() 메서드 호출
10 11 12 13 14 15 16 17 18 19 
Gonabiui-MacBook-Pro:chap04 gonabi$ 
*/

