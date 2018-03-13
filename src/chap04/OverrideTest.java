/**
오버라이딩을 테스트하기 위한 예
**/

class FaFa{
	public void sayHello(){
		System.out.println("FaFa의 sayHello()");
	}
}//end FaFa class

class Baby extends FaFa{
	//FaFa클래스의 sayHello() 메서드의 재정의
	public void sayHello(){
		System.out.println("Baby의 sayHello()");
	}
	
}//end Baby class



public class OverrideTest{
	
	public static void main(String[] args){
		FaFa f = new FaFa();
		f.sayHello();//FaFa의 sayHello() 호출
		
		Baby b = new Baby();
		b.sayHello();//Baby의 sayHello() 호출
		
		FaFa fb = new Baby();
		fb.sayHello(); //Baby의 sayHello() 호출
		
	}
}

/*
	
Baby 클래스의 구조에서 앞부분은 FaFA클래스와 같기 때문에 이러한 캐스팅이 가능한 것이다.

업캐스팅
하위 클래스의 메모리가 상위 클래스로 캐스팅되는 것을 이 책에서는 업캐스팅(Upcasting)이라고 이름을 붙이고 있다.
이 업캐스팅에 대해서는 5장에서 다룬다.
아버지 이름으로 아들 메모리를 참조한다.
FaFa fb = new Baby();

하지만 여기서 우리는 아주 중요한 사항을 알 수 있다. 분명 FaFa fb가 가리킬 수 있는 부분은
FaFa 클래스의 sayHello() 부분까지이다. 하지만 fb로 sayHello()를 호출한다면 Baby() 의 sayHello()가 호출된다.

즉 상위 클래스의 이름으로 하위 클래스의 메서드가 호출되는 것이다.
	
*/