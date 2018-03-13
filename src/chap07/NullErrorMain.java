/*
실행 시에 NullPointerException 에러가 발생하는 예
*/
package chap07;

public class NullErrorMain {

	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length());//에러발생
		System.out.println("프로그램 종료");
	}

}

/*
Exception in thread "main" java.lang.NullPointerException
	at chap07.NullErrorMain.main(NullErrorMain.java:10)
*/
