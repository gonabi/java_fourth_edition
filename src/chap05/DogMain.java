/*
업캐스팅을 증명하는 예제	
*/

class Animal{
	//클래스 내부 작업
}

class Dog extends Animal{
	//클래스 내부 작업
}


public class DogMain{
	
	public static void main(String[] args){
		Animal ani = new Dog(); //상위클래스로 캐스팅이 가능하다.
	}
	
}