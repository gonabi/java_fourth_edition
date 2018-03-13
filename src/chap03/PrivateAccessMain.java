/**
private에 직접 접근하기 때문에 에러가 발생하는 예
**/
public class PrivateAccessMain{
	public static void main(String[] args){
		Person brother = new Person();//객체 생성
		brother.age=100; //public 멤버 접근
		brother.height=173.0F; //public 멤버 접근
		
		brother.weight = 67.0F; //private 멤버 접근 - 에러
		
		System.out.println("age:"+brother.age); //public 멤버 접근
		System.out.println("height:"+brother.height); //public 멤버 접근
		System.out.println("weight:"+brother.weight); //private 멤버 접근 - 에러
		
	}
}