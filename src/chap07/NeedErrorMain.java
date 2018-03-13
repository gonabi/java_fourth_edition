/*
필수적으로 에러루틴이 필요한 경우(에러)
*/
package chap07;
import java.io.*;

public class NeedErrorMain {

	public static void main(String[] args) {
		//파일열기
		FileReader f = new FileReader("NeedThrowExceptionMain.java");
		
		f.close();

	}//end main()

}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException

	at chap07.NeedErrorMain.main(NeedErrorMain.java:11)
*/
