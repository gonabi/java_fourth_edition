/*
Thread를 상속하는 두 개의 스레드 만들기(Thread 상속)	
*/

package chap08;

class DerivedThread extends Thread{
	public void run(){
		for( int i=0; i<50; i++ ){
			if(i%10==0){
				System.out.println();
			}
			System.out.print(i+"\t");
			
		}
	}
}



public class DerivedThreadMain2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		d1.start();
		d2.start();
		
		
		System.out.println("프로그램 종료");

	}

}

/*
Thread의 상속으로 구현하든, Runnable을 이용해서 구현하든, 스레드로써 동작하는 것은 같다.
하지만 Runnable은 인터페이스이며 Thread는 클래스라는 점을 감안해서 사용해야 한다.

만약 여러분이 다른 클래스를 미리 상속한 상태라면 Runnable을 이용하는 것이 바람직할 것이다.
그렇지 않다면 Thread를 상속하는 것이 훨씬 편하다. 상속 자체로 Thread의 모든 기능을 사용할 수 있기 때문에 훨씬 편한 것이다.	
*/