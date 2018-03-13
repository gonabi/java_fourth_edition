/**
Frame 내부에서 스레드 동작 시키기
**/
package chap08;
import java.awt.*;

class RunnableFrame extends Frame implements Runnable{
	
	public RunnableFrame(){
		new Thread(this).start();
	}//생성자
	
	public void run(){
		int i = 0;
		
		System.out.println("스레드 시작!");		
		while(i<20){
			if(i%10==0) {
				System.out.println();
			}
			
			System.out.print(i+"\t");
			this.setTitle("스레드 동작중"+ i++);
			
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				System.out.println(e);		
			}
		}
		System.out.println("스레드 종료!");
		
	}//인터페이스 구현
}

public class RunnableFrameMain {

	public static void main(String[] args) {
		
		RunnableFrame r = new RunnableFrame();
		r.setSize(300,100);
		r.setVisible(true);
		

	}//end main()

}

/*
스레드 시작!

0	1	2	3	4	5	6	7	8	9	
10	11	12	13	14	15	16	17	18	19	스레드 종료!
*/