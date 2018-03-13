/*
에러 처리 미루기의 예(에러 발생) - makeURL()을 사용할 때 에러처리 필요
*/
//package chap07;

import java.net.*;

public class ShiftError {

	//throws를 이용해서 에러 처리를 미루는 메서드
	public URL makeURL(String urlstr) throws MalformedURLException{
		return new URL(urlstr);			
	}


	public static void main(String[] args) {
		ShiftError s = new ShiftError();
		
		//에러처리 루틴 필요
		URL url = s.mekeURL("http://www.yahoo.com");
		

	}// end main()

}


/*
ShiftError.java:20: error: cannot find symbol
		URL url = s.mekeURL("http://www.yahoo.com");
		           ^
  symbol:   method mekeURL(String)
  location: variable s of type ShiftError
1 error
*/
