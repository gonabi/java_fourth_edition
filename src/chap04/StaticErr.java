/**
스태틱 멤버 메서드의 주의사항
**/

public class StaticErr{
	
	//private static int s; 해결
	private int s;
	
	//스태틱 멤버 메서드에서 일반 멤버 변수 사용(에러)
	public static void printStaticData(){
		System.out.println(s); //에러
	}
	
	
	
	public static void main(String[] args){
		StaticErr.printStaticData()
	}//end main()
}

/*
StaticErr.java:18: error: ';' expected
		StaticErr.printStaticData()
		                           ^
1 error
*/
