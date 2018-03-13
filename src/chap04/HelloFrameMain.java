/*
상속을 통해 간단히 창을 만드는 예제(Frame을 상속받아ㅏㅇ위 클래 창을 띄우기)	
*/

import java.awt.*;

class HelloFrame extends Frame{ //새로운 사용자 정의 프레임 클래스
	//단순히 상속만 받은 클래스
}


public class HelloFrameMain{ //새로 만든 HelloFrame을 테스트 하는 클래스
	
	public static void main(String[] args){
		
		HelloFrame h = new HelloFrame(); //새로운 Frame의 메모리 생성
		h.setSize(200,200); //화면에 Display될 창의 크기 지정
		h.setVisible(true); //화면에 나타내기
		
	}// end main
	
}


/*
상속(Inheritance)의 특징
하위 클래스가 상위 클래스를 상속받았을 때, 일단 하위 클래스는 상위 클래스의 모든 권한을 갖게 된다.

상속의 느낌
상속을 받는 순간 현재의 클래스는 곧 상위 클래스에서 출발한다.
몇 가지 규칙은 간단하지만 삭송을 제대로 이용하기 위해서는 많은 개념들을 배워야 한다.
*/