/*
스택 프레임 실습을 위한 예제	
*/

public class StackMain{
	
	public static int sum(int a, int b){
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		int z = sum(x,y);
		System.out.println(z);
		
	}//end main()
}

// 30