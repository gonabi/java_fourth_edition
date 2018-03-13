/**
Object 형을 매개변수로 사용한 예	
**/

class Top{
	private Object data = null;
	
	public void setData(Object data){
		this.data = data;
	}
	
	public Object getData(){
		return this.data;
	}
	
}


public class UserGenericMain{
	
	public static void main(String[] args){
		String str = "Hello Object 방식";
		
		Top t = new Top();
		t.setData(str);
		
		String str2 = (String)t.getData();//제너릭
		System.out.println(str2);
		
	}
}

/*
Gonabiui-MacBook-Pro:chap06 gonabi$ javac UserGenericMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java UserGenericMain
Hello Object 방식

이쯤에서 제너릭이 등장한다. Top형의 클래스를 디자인할 때 형을 고정하는 것이 아니라 Top형의
클래스를 사용할 때 형을 지정하고 사용하는 기술이 바로 제너릭인 것이다.
	
	
Top<T>라는 의미는 Top형 내에 지금은 형을 알 수 없는 T라는 타입을 이용하고 있다는 의미이다.
그렇다면 언젠가 T라는 타입을 지정하고 사용해야 할 것이다. 
*/