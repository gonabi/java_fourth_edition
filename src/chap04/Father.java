/*
아버지
하위 클래스로 사용할 예	
*/

public class Father extends GrandFather{
	
	public Father(){
		System.out.println("I am a Father");
	}//생성자, 생성자는 리턴타입이 없다.
	
	public void sayFatherNumber(){
		System.out.println("sayFatherNumber() 메서드 호출");
		for(int i=10; i<20; i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}

