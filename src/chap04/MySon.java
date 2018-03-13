/**
상위 클래스의 private 멤버에 접근하기 때문에 에러가 발생하는 예제
**/

public class MySon extends MyFather{
	
	public void sayFatherNames(){
		System.out.println(name);//MyFather의 public 멤버에 접근
		System.out.println(nickname);//MyFather의 private 멤버에 접근(에러)
		
	}//end method
	
	
	
	public static void main(String[] args){
		MySon m = new MySon();
		m.sayFatherNames();
	}// end main
}

/*
	
MySon.java:9: error: nickname has private access in MyFather
		System.out.println(nickname);//MyFather의 private 멤버에 접근(에러)
		                   ^
1 error


*/	
	