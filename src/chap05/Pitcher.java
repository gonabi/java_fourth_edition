/**
BodySign 인터페이스를 구현하는 예제
**/

public class Pitcher implements BodySign{
	
	public void throwBall(int how){
		if(how==BodySign.CENTER){
			System.out.println("Center 로 던집니다.");
		}else if(how==BodySign.LEFT){
			System.out.println("Left 로 던집니다.");
		}else if(how==BodySign.RIGHT){
			System.out.println("Right 로 던집니다.");
		}else if(how==BodySign.DOWN){
			System.out.println("Down 로 던집니다.");
		}else if(how==BodySign.UP){
			System.out.println("Up 로 던집니다.");
		}else{
			System.out.println("이상한 볼입니다.");
		}
	}//인터페이스 메서드 구현
	
	
	
	public static void main(String[] args){
		Pitcher p = new Pitcher();
		
		//1. static final 변수를 사용
		p.throwBall(BodySign.CENTER);//final static 변수를 사용
		p.throwBall(BodySign.LEFT);
		p.throwBall(BodySign.RIGHT);
		p.throwBall(BodySign.DOWN);
		p.throwBall(BodySign.UP);
		
		//2. 상수 자체를 이용하는 예
		p.throwBall(1);
		p.throwBall(2);
		p.throwBall(3);
		p.throwBall(4);
		p.throwBall(5);
		p.throwBall(1000);//임의의 수를 이용
		
	}// end main
}

/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac BodySign.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ javac Pitcher.java
Gonabiui-MacBook-Pro:chap05 gonabi$ java Pitcher
Center 로 던집니다.
Left 로 던집니다.
Right 로 던집니다.
Down 로 던집니다.
Up 로 던집니다.
Center 로 던집니다.
Left 로 던집니다.
Right 로 던집니다.
Down 로 던집니다.
Up 로 던집니다.
이상한 볼입니다.	
*/