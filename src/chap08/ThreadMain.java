/*
Runnable을 구현해서 만든 스레드(스레드를 생성하는 방법)
*/

package chap08;


class Top implements Runnable{ //Runnable.class 인터페이스 내부적으로 있음
	public void run() {
		for(int i=0; i<50; i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(i+"\t");
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top t = new Top();
		Thread thd = new Thread(t);
		thd.start();
		
		System.out.println("프로그램 종료");
	
	}// end main()

}
/*
프로그램 시작
프로그램 종료

0	1	2	3	4	5	6	7	8	9	
10	11	12	13	14	15	16	17	18	19	
20	21	22	23	24	25	26	27	28	29	
30	31	32	33	34	35	36	37	38	39	
40	41	42	43	44	45	46	47	48	49	

main()도 하나의 스레드로써 동작하다가 다른 스레드를 동작시키고 있는 것이다. start() 하는 순간 동시에
작업이 이루어지고 있는 것이다. 그렇기 때문에 '프로그램 종료' 메시지가 먼저 출력이 된것이다.
결과적으로 보면 스레드란 run()이 독립적으로 호출된다.


*/
