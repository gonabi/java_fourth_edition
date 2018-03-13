/**
BombComputer를 동작시키는 프로그램(try, catch만 사용한 경우)	
**/

public class BombComputerErrorMain{
	
	public static void main(String args[]){
		
		BombComputer bc = new BombComputer();
		
		try{
			bc.powerOn();
			bc.process();//에러발생
			bc.powerOff();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}

/*
폴발물 처리 컴퓨터 전원 ON!
작업처리1
작업처리2
java.lang.Exception: 작업처리3 오류발생 곧 폭발합니다. !@#$
	at BombComputer.process(BombComputer.java:25)
	at BombComputerErrorMain.main(BombComputerErrorMain.java:13)
Gonabiui-MacBook-Pro:chap07 gonabi$ 
*/