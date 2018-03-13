/**
Frame과 Thread 분리시켜서 구현
**/

package chap08;

import java.awt.*;

class SoloFrame extends Frame{//상속
	public SoloFrame(){
		SoloThread t = new SoloThread(this);
		t.start();
	}//생성자
}

class SoloThread extends Thread{//상속
	private Frame f = null;
	public SoloThread(Frame f){
		this.f = f;//SoloFrame의 참조값 챙겨두기
	}//생성자
	
	
	public void run(){//abstract
		int i=0;
		System.out.println("스레드 시작!");
		while(i<20){
			System.out.print(i+"\t");
			f.setTitle("스레드 동작중"+ i++);
			try {
				this.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("스레드 종료!");
	}
}


public class SoloFrameMain {

	public static void main(String[] args) {
		SoloFrame s = new SoloFrame();
		s.setSize(300, 100);
		s.setVisible(true);
			
	}// end main()

}

/*
스레드 시작!
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	스레드 종료!
*/


