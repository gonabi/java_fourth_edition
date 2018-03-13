/*
추상 클래스를 구현하는 예	
*/

public class LGRemoteTV extends RemoteTV{
	
	public void channelDown(){
		nChannel--; //nChannel은 protected로 선언 되어서 접근할 수 있다.
		System.out.println("TV Channel Down "+nChannel);
	}
	
	
	public static void main(String[] args){
		LGRemoteTV tv = new LGRemoteTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}
}

/*
	
Gonabiui-MacBook-Pro:chap05 gonabi$ java LGRemoteTV
TV 전원 On!
TV Channel Up 1
TV Channel Down 0
TV 전원 Off!

*/