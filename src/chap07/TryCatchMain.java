/*
에러처리 루틴이 삽입된 예(실행 시에 에러처리 루틴에 의해 에러가 처리된다.)
*/
package chap07;

public class TryCatchMain {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e.toString()+"에러가 발생했습니다.");
			System.out.println("에러처리 루틴 실행");
		}
		System.out.println("프로그램 종료");
	}

}
/*
java.lang.NullPointerException에러가 발생했습니다.
에러처리 루틴 실행
프로그램 종료
*/