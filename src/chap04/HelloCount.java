/**
스태틱 멤버 변수를 테스트하는 예제
**/

public class HelloCount{
	
	//sCount의 값은 단 한번만 초기화
	private static int sCount = 0;
	
	//nCount의 값은 객체를 생성할 때마다 초기화
	private int nCount = 0;
	
	public void sayHello(){
		sCount += 1;
		nCount += 1;
		System.out.println("전체:"+sCount+"번째 인사를 합니다. Hello!");
		System.out.println("전체:"+nCount+"번째 인사를 합니다. Hi!");
	}// end sayHello()
	
	public static void main(String[] args){
		HelloCount h1 = new HelloCount();
		HelloCount h2 = new HelloCount();
		
		//h1은 2번 인사
		System.out.println(h1+"의 인사");
		h1.sayHello();
		h1.sayHello();
		
		//h2은 3번 인사
		System.out.println(h2+"의 인사");
		h2.sayHello();
		h2.sayHello();
		h2.sayHello();
		
		//전체 5번 인사
		
	}//end main
}



/*
출력
Gonabiui-MacBook-Pro:chap04 gonabi$ javac HelloCount.java 
Gonabiui-MacBook-Pro:chap04 gonabi$ java HelloCount
HelloCount@74a14482의 인사
전체:1번째 인사를 합니다. Hello!
전체:1번째 인사를 합니다. Hi!
전체:2번째 인사를 합니다. Hello!
전체:2번째 인사를 합니다. Hi!
HelloCount@1540e19d의 인사
전체:3번째 인사를 합니다. Hello!
전체:1번째 인사를 합니다. Hi!
전체:4번째 인사를 합니다. Hello!
전체:2번째 인사를 합니다. Hi!
전체:5번째 인사를 합니다. Hello!
전체:3번째 인사를 합니다. Hi!
*/








