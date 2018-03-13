//String 포맷팅(Formatting)의 예
package chap07;

public class StringFormattingMain {

	public static void main(String[] args) {
		
		//1. Formating의 예
		String s1 = String.format("%s %d %f %o %h", "Hello",100,3.14F,100,100);
		
		//2. 숫자 포매팅의 예
		String s2 = String.format("%,d", 100000000);//숫자에 1000자리마다 콤마(,)를 첨부
		String s3 = String.format("%.3f", 42.000000);//소수 3째 자리까지 표현하기 위해서 사용하는 float형 표현
		String s4 = String.format("%,.2f", 12345.678901);//소수점 이하는 2째 자리, 소수점 이상은 1000자리씩 콤마(,)로 구분하는 방법
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
/*
Hello 100 3.140000 144 64
100,000,000
42.000
12,345.68
*/