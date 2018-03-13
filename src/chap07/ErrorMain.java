/*
FileReader는 의무적으로 FileNotFoundException을 처리해주어야 하지만 예외처리를 하지 않은 경우
*/

import java.io.*;

public class ErrorMain{
	public static void main(String[] args){
		FileReader fr = new FileReader("ErrorMain.java");
		
	}
}

/*
Gonabiui-MacBook-Pro:chap07 gonabi$ javac ErrorMain.java 
ErrorMain.java:9: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
		FileReader fr = new FileReader("ErrorMain.java");
		                ^
1 error
*/