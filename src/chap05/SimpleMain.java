/**
상속만으로 구현 되는 추상 클래스
**/

class SimpleCollector extends SimpleAdapter{//단순히 추상 클래스를 상속만 함
		
}


public class SimpleMain{
	
	public static void main(String[] args){
		SimpleCollector s = new SimpleCollector();	
		s.printHello();
	}
}

/*
추상 클래스는 상속을 목적으로 한다는 특징을 가지고 있기 때문에 이러한 기법이 가능하다.

Gonabiui-MacBook-Pro:chap05 gonabi$ java SimpleMain
SimpleAdapter의 printHello()

*/