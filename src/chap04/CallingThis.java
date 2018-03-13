/**
this 를 이용한 생성자의 호출
**/

public class CallingThis{
	private String name;
	private int age;
	
	public CallingThis(){
		this("이름없음"); //this를 이용해서 CallingThis(String name)생성자 호출
		System.out.println("CallingThis() 생상자 완료");
	}//생성자

	public CallingThis(String name){
		this(name,-1); //this를 이용해서 CallingThis(String name, int age) 생성자 호출
		System.out.println("CallingThis(String name) 생상자 완료");
	}//생성자

	public CallingThis(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("name:"+name+"age:"+age);
		System.out.println("CallingThis(String name, int age) 생상자 완료");
		
	}//생성자
	
	
	
	public static void main(String[] args){
		CallingThis c = new CallingThis();
	}
	
	
}


/*
name:이름없음age:-1
CallingThis(String name, int age) 생상자 완료
CallingThis(String name) 생상자 완료
CallingThis() 생상자 완료

*/