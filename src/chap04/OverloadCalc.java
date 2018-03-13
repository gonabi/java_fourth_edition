/*

오버로딩 메서드는 매개변수의 개수와 형이 달라야 한다. (여기서는 매개변수의 형만을 테스트하고 있다.)
*/

public class OverloadCalc{
	
	//오버로딩 메서드
	public int plus(int a, int b){
		System.out.println("int plus(int a, int b)");
		return (a+b);
	}

	//오버로딩 메서드
	public float plus(float a, float b){
		System.out.println("plus(float a, float b)");
		return (a+b);
	}
	
	//오버로딩 메서드
	public double plus(double a, double b){
		System.out.println("plus(double a, double b)");
		return (a+b);
	}
	
	
	public static void main(String[] args){
		OverloadCalc c = new OverloadCalc();

		int i = c.plus(3,5); // plus(int, int)
		float j = c.plus(0.1f,0.2f);
		double k = c.plus(0.5d, 0.7d);
		
		System.out.println("int합: "+i);
		System.out.println("float합: "+j);
		System.out.println("double합: "+k);
			
	}//end main()
}

/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac OverloadCalc.java
Gonabiui-MacBook-Pro:chap04 gonabi$ java OverloadCalc
int plus(int a, int b)
plus(float a, float b)
plus(double a, double b)
int합: 8
float합: 0.3
double합: 1.2
	
	
*/

