/*
두 개의 스레드를 생성한 후 실행하는 예( Runnable 구현 )
*/

//package chap08;

class Top implements Runnable{
	public void run(){
		for(int i=0; i<50; i++)	{
			if(i%10==0){
				//System.out.println();	
			}
			System.out.print(i+"\t");
		}
		
	}	
}


public class ThreadMain2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//1. Runnable을 구현하는 객체 만들기
		Top t = new Top();
		
		//2. Runnable을 장착한 후 진짜 스레드 만들기
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		
		//3. 스레드 동작 시키기
		thd1.start();
		thd2.start();
		 
		System.out.println("프로그램 종료");

	}

}
