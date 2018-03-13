/*
인터페이스를 전부 구현하지 않아서 다시 추상 클래스가 되는 예제
*/

public abstract class RemoteTV implements IRemoteControl{
	
	protected int nChannel = 0; //평상시 private로 되다가 생성되면 public로 접근할 수 있다.
	protected boolean bPower = false;
	
	public void powerOn(){
		bPower = true;
		System.out.println("TV 전원 On!");
	}
	
	public void powerOff(){
		bPower = false;
		System.out.println("TV 전원 Off!");
	}
	
	public void channelUp(){
		nChannel++;
		System.out.println("TV Channel Up "+ nChannel );
	}
	
/*
	public void channelDown(){
		
	}	
*/
	
}

/*
인터페이스의 모든 추상 메서드를 구현한 것이 아니다.
channelDown() 추상 메서드를 구현하지 않았다. 인터페이스의 일부만 구현하고 일부는 구현하지
않았다면 해당 클래스는 다시 추상 클래스가 되어야 한다. 그렇기 때문에 클래스의 선언부에 다음과 같이 
abstract을 명시하고 있다.

*/
