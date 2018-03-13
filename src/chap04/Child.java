/*
아들
3 단계 상속에서 최하위 클래스	
*/

public class Child extends Father{
	
	public Child(){
		System.out.println("I am a child");
	}//생성자
	
	public void sayChildNumber(){
		System.out.println("sayChildNumber() 메서드 호출");
		for(int i=20; i<30; i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}