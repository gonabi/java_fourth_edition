/*
사용자가 에러 이벤트를 직접 발생시키는 경우를 테스트하는 예
*/
package chap07;

public class UseThrowMain {

	public static void main(String[] args) {
		try {
			throw new Exception("이것이 에러 메시지");
		}catch(Exception e) {
			System.out.println("--Exception 발생구문--");
			System.out.println("정보: e.getMessage():"+e.getMessage());
			System.out.println("정보: e.toString():"+e.toString());
			e.printStackTrace();
			
			return;
		}finally {
			System.out.println("finally:결국이리로 오는군요");
		}

	}// end main()

}
/*
--Exception 발생구문--
정보: e.getMessage():이것이 에러 메시지
정보: e.toString():java.lang.Exception: 이것이 에러 메시지
java.lang.Exception: 이것이 에러 메시지
finally:결국이리로 오는군요
	at chap07.UseThrowMain.main(UseThrowMain.java:10)
*/