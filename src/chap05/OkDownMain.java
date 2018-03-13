/**
형확인 후 다운 캐스팅	
**/

class OkDown extends Object{
	
}


public class OkDownMain{
	
	public static void main(String[] args){
		
		OkDown d = new OkDown();
		Object obj = d; //업스캐딩은 묵시적으로 이루어진다.
		System.out.println("Object obj => "+obj);
		
		
		if( obj instanceof OkDown ){ //형확인
			OkDown okt = (OkDown)obj;//업캐스팅된 것을 다시 다운캐스팅- 강제캐스팅
			System.out.println("OkDown t => "+okt);	
		}else{
			System.out.println("형이 맞지 않습니다.");	
		}
		
	}
}

/*
Object obj => OkDown@74a14482
OkDown t => OkDown@74a14482
*/