/**
업캐스팅과 가상메서드의 이해
**/

class Shape{
	public void draw(){
		System.out.println("도형을 그립니다.");
	}
}


class Circle extends Shape{
	private String type="원";
	public void draw(){
		System.out.println(type+"을 그립니다.");
	}
}


public class UpcastingMain{
	
	public static void main(String[] args){
		Circle c = new Circle();
		c.draw(); //Circle의 draw() 호출
		
		Shape s = c; //업캐스팅
		s.draw(); //업캐스팅 후 상위 클래스의 이름으로 draw() 호출
	}
}

/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac UpcastingMain.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ java UpcastingMain
원을 그립니다.
원을 그립니다.
*/