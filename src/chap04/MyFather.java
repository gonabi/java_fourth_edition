/**
private 멤버를 포함한 상위 클래스	
**/

public class MyFather{
	
	public String name;
	private String nickname;//private 멤버 변수
	
	public MyFather(){
		name="위대한 아버지";
		nickname = "고나비";
	}//생성자
	
	
	public String getNickName(){
		return nickname;
	}//메서드
	
	
}


