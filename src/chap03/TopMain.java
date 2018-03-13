/**
Top 클래스를 테스트하는 예제
**/

public class TopMain{
	public static void main(String[] args){
		Top t = new Top(); //Top객체 생성
		t.a = 100; //멤버 변수 a에 값 할당
		t.b = 200; //멤버 변수 b에 값 할다
		int s = t.sum(3,5); // sum() 메서드 호출한 후 리턴값을 s로 값복사
	
		//Top t의 멤버 변수 출력
		System.out.println("a="+t.a);
		System.out.println("b="+t.b);
		
		//메서드 호출 결과 출력	
		System.out.println("t.sum(3,6)의 결과는:"+t.sum(3,6));
		System.out.println("s="+s);//s의 값 출력	
	}
}
