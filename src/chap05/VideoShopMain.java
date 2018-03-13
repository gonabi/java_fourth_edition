/*
VideoShop 클래스를 테스트하는 예	
*/
package chap05;
public class VideoShopMain{
	
	public static void main(String[] args){
		String temp;
		VideoShop vs = new VideoShop();
		System.out.println("보유한 비디오 개수는 "+vs.getCount());
		
		
		//1. 3개의 비디오 반납
		vs.enQueue("메트릭스1");//비디오 반납
		vs.enQueue("메트릭스2");//비디오 반납
		vs.enQueue("메트릭스3");//비디오 반납
		System.out.println("보유한 비디오 개수는 "+vs.getCount());
		
		
		//2. 3개의 비디오 빌려줌
		temp = vs.deQueue();
		System.out.println(temp + "빌림");
		temp = vs.deQueue();
		System.out.println(temp + "빌림");
		temp = vs.deQueue();
		System.out.println(temp + "빌림");
		
		
		System.out.println("보유한 비디오 개수는 "+vs.getCount());
		
	}
}