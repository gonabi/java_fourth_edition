/*
단순한 라이브러리를 사용한 창만들기 예제
*/

//Frame을 사용하기 위해서는 java.awt.Frame을 이용해야 한다.
//java.awt 내의 모든 패키지를 사용하겠다는 의미의 import
import java.awt.*;


public class LibFrameMain{
	
	public static void main(String[] args){
		Frame f = new Frame();//창을 위한 메모리 만들기
		f.setSize(200,200);//화면에 디스플레이 될 창의 크기 지정
		f.setVisible(true);//화면에 나타내기
	}
}