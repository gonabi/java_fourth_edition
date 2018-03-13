/**
Generic을 매개변수로 사용한 예
**/

class Top<T>{
	private T data = null;
	
	public void setData(T data){
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
	
}


public class UserGenericMain2{
	
	public static void main(String[] args){
		String str = "Hello Generic 방식";
		Top<String> t = new Top<String>();
		t.setData(str);
		
		String str2 = t.getData();
		System.out.println(str2);
		
	}
}

/*

Gonabiui-MacBook-Pro:chap06 gonabi$ javac UserGenericMain.java
Gonabiui-MacBook-Pro:chap06 gonabi$ java UserGenericMain
Hello Object 방식
*/