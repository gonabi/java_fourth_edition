/*
디폴트 생성자를 재정의하는 예제
디폴트 생성자를 재정의하면 기존의 디폴트 생성자는 사라지고 사용자가 만든 새로운 생성자가 사용된다.	
*/

public class TopConstructor{
	
	private String name = null;
	private String address = null;
	private int age = 0;
	
	//디폴트 생성자를 다시 만듬
	public TopConstructor(){
		name = "이름없음";
		address="주소없음";
		age = 0;
	}
	
	
	public void setData(String n, String a, int g){
		name = n;
		address = a;
		age = g;
	}
	public String getData(){
		String str = name+","+address+","+age;
		return str;
	}
	
	
	
	public static void main(String[] args){
		TopConstructor tc = new TopConstructor();//객체 생성
		String s;
		
		s=tc.getData();//생성자에서 초기화된 값을 얻어 냄
		System.out.println(s);
		
		
		tc.setData("홍길동","서울시 중구",41);//멤버 변수 값 할당
		s=tc.getData();//할당된 값 가져오기
		System.out.println(s);
		
		
		
		
	}// end main()
}


/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac TopConstructor.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java TopConstructor
이름없음,주소없음,0
홍길동,서울시 중구,41
*/



