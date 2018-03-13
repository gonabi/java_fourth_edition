/**
인터페이스에 사용된 멤버변수의 예
**/

public interface BodySign{
	//1. 키워드를 명시하지 않은 경우
	int CENTER=1;
	int LEFT=2;
	int RIGHT=3;
	int DOWN=4;
	int UP=5;
	
	void throwBall(int how);
	
	
	
	//2. 키워드를 명시한 경우
	/*
	public static final int CENTER=1;	
	*/
	
}