/**
Frame의 상속과 Runnable의 구현
Thread를 상속하지 못하는 경우 Runnable로 구현
**/

package chap08;

import java.awt.*;

class RunFrame extends Frame implements Runnable{
	public void run(){
		int i = 0;
		System.out.println("스레드 시작!");
		
		while(i<20){
			System.out.println(i+"\t");	
			this.setTitle("스레드 동작중"+ i++);
			try{
				Thread.sleep(100);//스레드 시간 설정
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("스레드 종료!");
	}
}

public class RunFrameMain {

	public static void main(String[] args) {
		RunFrame r = new RunFrame();
		r.setSize(300,100);
		r.setVisible(true);
		
		Thread t = new Thread(r);
		t.start();
		

	}// end main()

}
/*
스레드 시작!
0	
1	
2	
3	
4	
5	
6	
7	
8	
9	
10	
11	
12	
13	
14	
15	
16	
17	
18	
19	
스레드 종료!

*/
