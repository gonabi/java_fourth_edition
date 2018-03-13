/**
에러처리 미루기기의 예(에러처리 미루기를 직접 구현하는 예)
**/


import java.net.*;

public class ShiftCatch{
	
	public URL makeURL(String urlstr) throws MalformedURLException{
		return new URL(urlstr);
	}
	
	
	public static void main(String[] args){
		ShiftCatch p = new ShiftCatch();
		
		try{
			//정확한 URL을 입력하지 않았기 때문에 에러 발생
			URL url = p.makeURL("htttttp://www.daum.net");
		}catch(MalformedURLException e){
			e.printStackTrace();
		}finally{
			System.out.println("finally:결국 이리로 오는군요.");
		}
		
		
	}//end main()
	
	
}

/*


java.net.MalformedURLException: unknown protocol: htttttp
	at java.net.URL.<init>(URL.java:593)
	at java.net.URL.<init>(URL.java:483)
	at java.net.URL.<init>(URL.java:432)
	at ShiftCatch.makeURL(ShiftCatch.java:11)
	at ShiftCatch.main(ShiftCatch.java:20)
finally:결국 이리로 오는군요.
*/