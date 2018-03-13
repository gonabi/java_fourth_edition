/*
	디폴트 생성자를 테스트하는 예제
*/

public class DefaultCons{
	
	public void sayHello(){
		System.out.println("Hello World!");
	}
	
	
	public static void main(String[] args){
		DefaultCons d = new DefaultCons();//디폴트 생성자의 사용
		d.sayHello();		
	}//end main
}

// Hello World!
