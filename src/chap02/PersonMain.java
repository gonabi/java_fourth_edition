// package chap02;


/**
Person 클래스를 테스트하는 예
	
**/

public class PersonMain{
	public static void main(String[] args){
		Person brother = new Person();
		brother.age = 100;
		brother.height = 170.F;
		brother.weight = 67.0F;
		
		System.out.println("age:"+brother.age);	
		System.out.println("height:"+brother.height);	
		System.out.println("weight:"+brother.weight);	
	}
}