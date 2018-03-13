/**
스태틱 멤버 메서드를 테스트하는 예제
**/

public class TopStatic{
	
	//스태틱 멤버 메서드
	public static int sum(int x, int y){
		return x+y;
	}
	
	//일반 멤버 메서드
	public int minus(int x, int y){
		return x-y;
	}
	
	
	
	public static void main(String[] args){
		//1. 클래스 이름으로 스태틱 멤버 메서드에 접근
		int s1 = TopStatic.sum(100, 200);
		System.out.println("TopStatic.sum(100, 200) : "+s1);
		
		//2. 객체 이름으로 스태틱 멤버 메서드에 접근
		TopStatic t = new TopStatic();
		int s2 = t.sum(100,200);
		System.out.println("t.sum(100,200) : "+s2);
		
		//3. 일반 멤버 메서드의 접근
		int s3 = t.minus(100,200);
		System.out.println("t.minus(100,200) : "+s3);
		
		
	}// end main()
}
/*

TopStatic.sum(100, 200) : 300
t.sum(100,200) : 300
t.minus(100,200) : -100

클래스의 이름으로 스태틱 메서드에 접근
int s1 = TopStatic.sum(100,200);

객체의 이름으로 스태틱 멤버 메서드에 접근
TopStatic t = new TopStatic();
int s2 = t.sum(100,200);

*일반 메서드는 객체의 이름으로만 접근해야 한다.

*/