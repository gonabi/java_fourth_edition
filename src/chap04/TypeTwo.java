/**
하나의 메서드와 main()을 포함한 클래스
**/
public class TypeTwo{
	public void sayHello(){
		System.out.println("안녕하세요 TypeTwo의 sayHello입니다.");
	}
	
	public static void main(String[] args){
		TypeTwo t = new TypeTwo();
		t.sayHello();
	}
}