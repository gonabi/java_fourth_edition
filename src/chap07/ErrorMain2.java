/*
try, catch를 이용해서 FileNotFoundException을 처리한 경우
*/
package chap07;

import java.io.*;


public class ErrorMain2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ErrorMain.java");
			//fr을 이용해서 작업
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		

	}//end main()

}
/*
java.io.FileNotFoundException: ErrorMain.java (No such file or directory)
*/