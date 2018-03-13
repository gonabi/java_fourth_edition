package chap05;

/**
IQueue와 Shop을 동시에 상속하고 구현하는 예
**/


public class VideoShop extends Shop implements IQueue{
	public void enQueue(String video){
		System.out.println(video+"반납");
		this.store.addElement(video);
	}
	public String deQueue(){
		return (String)this.store.remove(0);
	}
	
	
}