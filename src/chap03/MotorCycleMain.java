/**
참조 값 복사를 테스트하는 예
**/

public class MotorCycleMain{
	public static void main(String[] args){
		MotorCycle c = new MotorCycle(); //메모리 있는 객체 변수 선언
		c.setData(9872,150);
		c.drive();		
		System.out.println("객체 c:"+c);//객체 출력
		System.out.println();//한줄 추가
		
		MotorCycle m = c; //참조값 복사
		m.drive(); //복사된 참조값을 이용한 메서드 호출
		System.out.println("객체m :"+m); //객체 출력
		System.out.println();//한줄 추가
		
		System.out.println("객체 비교 c==m :"+(c==m)); 
		
		
	}
}
/*
이 오토바이의 번호판은9872입니다.
오토바이는 현재150Km 속도로 달립니다.
객체 c:MotorCycle@74a14482

이 오토바이의 번호판은9872입니다.
오토바이는 현재150Km 속도로 달립니다.
객체m :MotorCycle@74a14482

객체 비교 c==m :true
*/