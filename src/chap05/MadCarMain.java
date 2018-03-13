//package chap05;
/**
복합적인 업캐스팅의 구현
여러 개의 인터페이스와 추상 클래스를 동시에 구현 및 상속	

**/


interface IFork{
	void dig();
}

interface ITank{
	void shoot();
}


abstract class AutoCar{
	public abstract void drive();
}


class MadCar extends AutoCar implements IFork,ITank{
	//interface
	public void dig(){
		System.out.println("땅을 파고 있습니다.");
	}
	public void shoot(){
		System.out.println("포를 쏘고 있습니다.");
	}	

	//abstract
	public void drive(){
		System.out.println("운전을 하고 있습니다.");
	}
	
	
	
	//MadCar 메서드
	public void soundHorn(){
		System.out.println("빠아앙! 빠아앙!");
	}	
	
}


public class MadCarMain{
	
	public static void main(String[] args){
		MadCar m = new MadCar();
		m.dig();
		m.shoot();
		m.drive();
		m.soundHorn();
		
		//1. IFork 인터페이스로 업캐스팅
		IFork f = m;
		f.dig();
		
		
		//2. ITank 인터페이스로 업캐스팅
		ITank t = m;
		t.shoot();
		
		
		//3. AutoCar 추상 클래스로 업캐스팅
		AutoCar c = m;
		c.drive();
		
			
	}
}


/*
Gonabiui-MacBook-Pro:chap05 gonabi$ javac MadCarMain.java 
Gonabiui-MacBook-Pro:chap05 gonabi$ java MadCarMain
땅을 파고 있습니다.
포를 쏘고 있습니다.
운전을 하고 있습니다.
빠아앙! 빠아앙!
땅을 파고 있습니다.
포를 쏘고 있습니다.
운전을 하고 있습니다.
*/















