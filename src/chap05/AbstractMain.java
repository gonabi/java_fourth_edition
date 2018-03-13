/**
추상 클래스의 업캐스팅을 테스트하는 예
**/

abstract class Bell{
	public abstract void ring();
}


class AlarmBell extends Bell{
	public void ring(){//추상 메서드 구현
		System.out.println("삐리리릭! 삐리리릭!");
	}
}


public class AbstractMain{
	
	public static void main(String[] args){
		Bell b = new AlarmBell();  //업캐스팅
		b.ring();
	}
}

/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac AbstractMain.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ java AbstractMain
삐리리릭! 삐리리릭!
*/