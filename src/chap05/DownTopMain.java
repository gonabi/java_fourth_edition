/**
다운 캐스팅의 테스트
**/

class DownTop extends Object{
	//클래스 내용
}


public class DownTopMain{
	
	public static void main(String[] args){
		
		DownTop d = new DownTop();
		Object obj = d; //업캐스팅은 묵시적으로 이루어진다.
		System.out.println("Objext obj => "+obj);
		
		
		DownTop t = (DownTop)obj;//업캐스팅된 것을 다시 다운캐스팅 - 강제 캐스팅
		System.out.println("DownTop t => "+t);
		
	}
}

/*
Objext obj => DownTop@74a14482
DownTop t => DownTop@74a14482
*/