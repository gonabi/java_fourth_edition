/**
인터페이스의 업캐스팅을 테스트하는 예제
**/

interface Tree{
	void leafShape();
}

class PineTree implements Tree{
	public void leafShape(){ //인터페이스 정의
		System.out.println("나뭇잎은 뽀족하다.");
	}
}

public class InterfaceMain{
	
	public static void main(String[] args){
		Tree t = new PineTree(); // 업캐스팅
		t.leafShape(); //PineTree의 leafShape() 호출
	}
}

/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac InterfaceMain.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ java InterfaceMain
나뭇잎은 뽀족하다.
*/