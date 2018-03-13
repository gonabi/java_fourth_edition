/**
StringBuffer 클래스의 사용
**/
package chap07;

public class StringBufferMain{
	
	public static void main(String[] args){
		
		//1. String 클래스는 수정이 불가능한 (Immutable) 클래스이다.
		String str1 = "www.";
		String str2 = "gonabi.";
		String str3 = "com";
		String str4 = str1+str2+str3;
		System.out.println(str4);
		
		String str5 = str4.replace("com", "net");
		System.out.println(str5);
		
		//2. StringBuffer 클래스는 수정이 가능한 클래스이다.
		StringBuffer sb = new StringBuffer();
		sb.append("www.");
		sb.append("gonabi.");
		sb.append("com");
		sb.replace(11, 14, "net");
		
		String str = sb.toString();
		System.out.println(str);
	}
	
}
/*
www.gonabi.com
www.gonabi.net
www.gonabi.net
*/

