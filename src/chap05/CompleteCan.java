/**
모든 추상 메서드의 구현
InCompleteCan에 남아 있던 모든 추상 메서드를 구현한 후 객체를 생성하는 예	
	
**/


public class CompleteCan extends InCompleteCan{
	
	public void printContent(){//EmptyCan의 printContent구현
		System.out.println("CompleteCan에서 printContent() 구현");
	}
	
	
	//새로운 멤버 메서드 추가
	public void sayHello(){
		System.out.println("CompleteCan에서 sayHello()메서드 추가 구현");
	}
	
	public static void main(String[] args){
		CompleteCan cc = new CompleteCan();
		cc.printName();
		cc.printContent();
		
		cc.sayHello();
	}
}

/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac InCompleteCan.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ javac CompleteCan.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ java CompleteCan
InCompleteCan에서 printName() 구현
CompleteCan에서 printContent() 구현
CompleteCan에서 sayHello()메서드 추가 구현

*/