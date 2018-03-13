/*
Exception으로 모든 에러 처리
*/
package chap07;

import java.io.*;

public class LevelCatchMain {

	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("LevelCatchMain.java");
			String s = null;
			System.out.println(s.toString());//NullPointerException 발생
			
		}catch(FileNotFoundException e1) {
			System.out.println("FileNotFoundException:"+e1);
			
			
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException:"+e2);
			
		}catch(Exception e3) {
			System.out.println("Exception:"+e3);
		}
		
		

	}// end main()

}
/*
FileNotFoundException:java.io.FileNotFoundException: LevelCatchMain.java (No such file or directory)
 */
