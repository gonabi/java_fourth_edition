/**
문자열 생성과 결합
**/

public class StringBasicMain{
	
	public static void main(String[] args){
		//문자열을 생성하는 방법 1
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		System.out.println("str1==str2 : "+(str1==str2));
		
		//문자열을 생성하는 방법 2
		String ntr1 = new String("Hello World!");
		String ntr2 = new String("Hello World!");
		System.out.println("str1==str2 : "+(ntr1==ntr2));
		
		//문자열 내에 이스케이프(Escape) 문자의 사용
		String myString = "c:\\javasrc\\chap07";
		System.out.println("이스케이프문자의 사용 : "+ myString);
		
	}//end main()
}


/*
str1==str2 : true
str1==str2 : false
이스케이프문자의 사용 : c:\javasrc\chap07
*/