/**
TopSecret 클래스를 테스트하는 예
**/
public class TopSecretMain{
	public static void main(String[] args){
		TopSecret t = new TopSecret();
		
		t.setSecret(1000);// private 멤버 변수에 값을 할당하는 메서드		
		int s = t.getSecret(); //private 멤버 변수의 값을 얻어오는 메서드
		
		System.out.println("s의 값은:"+s); //s의 값 출력
		System.out.println("t.getSecret():"+t.getSecret()); //t.getSecret()의 값 출력
		
		
	}	
}
/*
s의 값은:1000
t.getSecret():1000

*/
