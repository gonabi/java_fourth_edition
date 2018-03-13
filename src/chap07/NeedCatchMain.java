/*
파일 입출력을 위해 에러처리 루틴을 삽입한 예
*/
//package chap07;
import java.io.*;

public class NeedCatchMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		try{
			FileReader f = new FileReader("NeedCatchMain.java");
			//...파일 입출력 작업
			f.close();//파일 닫기
			
			
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
			
			
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}// end main()

}


/*
Gonabiui-MacBook-Pro:chap07 gonabi$ javac NeedCatchMain.java 
Gonabiui-MacBook-Pro:chap07 gonabi$ java NeedCatchMain
프로그램 시작
프로그램 종료
*/