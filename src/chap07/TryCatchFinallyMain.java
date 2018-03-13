/*
에러처리 루틴(try, catch, finally)이 삽입된 예
finally 블록은 무조건적인 실행
*/
package chap07;

public class TryCatchFinallyMain {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		}catch( NullPointerException e ) { 
			System.out.println(e.toString() +"에러가 발생했습니다.");
			System.out.println("에러처리 루틴 실행");
		}finally {
			//에러가 나든 나지 않든 무조건 실행되는 블록
			System.out.println("finally 구문 실행");
		}
		
		System.out.println("프로그램 종료");
	}

}

/*
java.lang.NullPointerException에러가 발생했습니다.
에러처리 루틴 실행
finally 구문 실행
프로그램 종료
*/
