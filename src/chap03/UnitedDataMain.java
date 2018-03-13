/**
UnitedData 클래스를 테스트하는 예
**/
public class UnitedDataMain{
	public static void main(String[] args){
		UnitedData d = new UnitedData(); // UnitedData 객체 생성
		d.x = 5; //멤버 변수에 값할당
		d.y = 10; //멤버 변수에 값할당
		
		System.out.println(d.plus()); //멤버변수를 이용한 plus() 메서드를 호출
		System.out.println(d.minus()); //멤버변수를 이용한 minus() 메서드를 호출
		System.out.println(d.divide()); //멤버변수를 이용한 devide() 메서드를 호출
		System.out.println(d.mul()); //멤버변수를 이용한 mul() 메서드를 호출
		
	}
}

/*
15
-5
0
50
*/