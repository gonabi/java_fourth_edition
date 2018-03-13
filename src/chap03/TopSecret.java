/**
public 메서드를 이용한 private 멤버 변수의 접근
**/
public class TopSecret{
	private int secret; //private 멤버 변수 선언
	
	//private 멤버에 값 할당하기
	public void setSecret(int x){ //private에 접근하는 public 멤버 메서드
		secret = x;		
	}
	
	//private 멤버의 값을 외부로 내보내기
	public int getSecret(){ // private 에 접근하는 public 멤버 메서드
		return secret;
	}
	
}
