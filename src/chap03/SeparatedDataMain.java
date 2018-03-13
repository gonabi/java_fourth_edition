/**
SeparatedData를 테스트하는 클래스
**/

public class SeparatedDataMain{
	public static void main(String[] args){
		SeparatedData d = new SeparatedData();//SeparatedData 객체 생성
		
		
		int plus = d.plus(5,10);
		int minus = d.minus(5,10);		
		int divide = d.divide(5,10);
		int mul = d.mul(5,10);
		
		
		System.out.println(plus); // plus() 메서드 호출 후 결과 출력
		System.out.println(minus); // minus() 메서드 호출 후 결과 출력
		System.out.println(divide); // divide() 메서드 호출 후 결과 출력
		System.out.println(mul); // mul() 메서드 호출 후 결과 출력
		
		/*
			15
			-5
			0
			50
			*/
		
	}
}