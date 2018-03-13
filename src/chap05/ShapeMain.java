/*
추상 클래스를 이용한 작업 구조
abstract 클래스를 이용한 작업 레벨링의 예	
*/

abstract class Shape{
	public abstract void draw();	
	public abstract void delete();	
}



class Circle extends Shape{
	public void draw(){
		System.out.println("원을 그립니다.");
	}
	public void delete(){
		System.out.println("원을 지웁니다.");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("삼각형을 하나,둘,셋 그립니다.");
	}	
	public void delete(){
		System.out.println("삼각형을 지웁니다.");
	}
	
}


class Rectangle extends Shape{
	public void draw(){
		System.out.println("사각형을 원,투,쓰리,포, 그립니다.");
	}
	public void delete(){
		System.out.println("사각형을 지웁니다.");		
	}
}



public class ShapeMain{
	
	public static void main(String[] args){
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		//1. 각각의 도형 그리기
		c.draw();
		t.draw();
		r.draw();
		
		//2. 각각 도형 지우기
		c.delete();
		t.delete();
		r.delete();
		
	}// end main
}

/*
	
Gonabiui-MacBook-Pro:chap05 gonabi$ javac ShapeMain.java
Gonabiui-MacBook-Pro:chap05 gonabi$ java ShapeMain
원을 그립니다.
삼각형을 하나,둘,셋 그립니다.
사각형을 원,투,쓰리,포, 그립니다.
원을 지웁니다.
삼각형을 지웁니다.
사각형을 지웁니다.

*/






