/**
잘못된 형식끼리의 참조값 할당을 증명하는 예제
**/
class Sos{
	//비어 있는 클래스	
}
class Tot{
	//비어 있는 클래스	
}

public class RefMain{
	public static void main(String[] args){
		Sos s = new Sos();
		Tot t = new Tot();
		
		//이 부분은 에러가 발생합니다.
		s = t; //서로 다른 타입끼리의 참조값 할당
	}	
}


/*
위의 예제는 컴파일되지 않는다.
서로 다른 타입끼리의 참조값 할당을 했기 때문에 컴파일 에러가 발생한다.

참고
하나의 파일에 여러 개의 클래스가 존재할 때 단 하나의 클래스만이 public 클래스가 될 수 있다.
보통 main을 포함한 클래스를 public 클래스로 둔다. 그리고 이 클래스의 이름이 파일의 이름이 된다.
	
*/
