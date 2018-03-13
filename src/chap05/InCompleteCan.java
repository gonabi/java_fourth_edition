/**
추상의 추상 - 추상 클래스의 메서드를 모두 구현하지 않은 예
**/

public abstract class InCompleteCan extends EmptyCan{
	
	//EmptyCan의 printName() 구현
	public void printName(){
		System.out.println("InCompleteCan에서 printName() 구현");
	}
	
}

/*
InCompleteCan 클래스는 EmptyCan을 상속했지만 EmptyCan의 모든 추상 메서드를 구현하지 않았기 때문에 
InCompleteCan 클래스 자체는 또 다시 추상 클래스가 된다.	
	
*/