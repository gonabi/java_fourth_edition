/*
네트워크에 관련된 의무적인 에러처리 루틴을 테스트하는 예(에러발생)
*/
//package chap07;

import java.net.*;

public class NeedNetErrorMain {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		try{
			URL url = new URL("http://www.google.com");
			System.out.println("URL:"+ url.toString());	
		}catch(MalformedURLException e){
			e.printStackTrace();
		}finally{
			System.out.println("finally:결국이리로 오는군요");	
		}
		
		System.out.println("프로그램 종료");
		
		
	}// end main()

}
/*

프로그램 시작
URL:http://www.google.com
finally:결국이리로 오는군요
프로그램 종료
*/