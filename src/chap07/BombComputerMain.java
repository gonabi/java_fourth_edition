/**
finally를 추가한 예
**/
//package chap07;




public class BombComputerMain {

	public static void main(String[] args) {
		BombComputer bc = new BombComputer();
		
		try{
			bc.powerOn();
			bc.process();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			bc.powerOff();
		}

	}// end main()

}
/*
폴발물 처리 컴퓨터 전원 ON!
작업처리1
작업처리2
java.lang.Exception: 작업처리3 오류발생 곧 폭발합니다. !@#$
	at BombComputer.process(BombComputer.java:25)
	at BombComputerMain.main(BombComputerMain.java:16)
폴발물 처리 컴퓨터 전원 OFF!
*/