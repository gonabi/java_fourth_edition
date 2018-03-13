/*
추상 클래스의 구현 - EmptyCan을 상속받아 완전한 클래스 만들기	
*/

public class BeerCan extends EmptyCan{
	
	public void printContent(){ //EmptyCan의 printContent() 구현
		System.out.println("고나비");
	}

	public void printName(){ //EmptyCan의 printName() 구현
		System.out.println("안녕하세요 고양이입니다.");	
	}
		
	
	
	public void sayHello(){ //새로운 멤버 메서드 추가
		System.out.println("안녕하세요 고나비입니다.");
	}
	
	public static void main(String args[]){
		BeerCan b = new BeerCan();
		b.printContent();
		b.printName();
		
		b.sayHello();
		
	}// end main
}

/*
고나비
안녕하세요 고양이입니다.
안녕하세요 고나비입니다.


*/