/*
catch 블록으로 처리하지 못한 경우
NullPointerException 블록이 없기 때문에 에러 발생
*/
package chap07;

import java.io.*;

public class LevelErrorMain {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("LevelErrorMain.java");
			String s = null;
			
			System.out.println(s.toString()); //NullPointerException 발생
			
		}catch(FileNotFoundException e1) {
			System.out.println("FileNotFoundException:"+e1);
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException:"+e2);
		}

	}//end main()

}
/*
FileNotFoundException:java.io.FileNotFoundException: LevelErrorMain.java (No such file or directory)
*/