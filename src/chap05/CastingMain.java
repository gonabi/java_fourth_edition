package chap05;

public class CastingMain {

	public static void main(String[] args) {
		byte b = 127;
		int i = b; //byte형을 int형으로 자동 캐스
		System.out.println("byte형이 int 형으로 캐스팅:"+i);
		
		i=128;
		//b=i;//int 형을 byte형으로 캐스팅하면 컴파일 에러 발생
		//해결책
		//강제로 캐스팅을 하고자 한다면 캐스팅 연산자 사용
		//b=(byte)i;
		
		b = (byte)i;
		System.out.println("int형이 byte형으로 캐스팅 : "+b);
		
		
	}
}
/*
byte형이 int 형으로 캐스팅:127
int형이 byte형으로 캐스팅 : -128
*/