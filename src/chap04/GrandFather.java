/*
할아버지
상위 클래스로 사용할 예	
*/

public class GrandFather{
	
	public GrandFather(){ //매개변수 없는 생성자
		System.out.println("I am a GrandFather");	
	}
		
	public void sayGrandNumber(){ //메서드
		System.out.println("sayGrandNumber() 메서드 호출");
		for( int i=0; i<10; i++ ){
			System.out.print(i+" "); //0~9
		}
		System.out.println();// 출력 라인 다음 줄로 이동
	}// end sayGrandNumber()
	
}





