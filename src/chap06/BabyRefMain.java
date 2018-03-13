/*
객체의 참조를 테스트하기 위한 예제
*/
package chap06;

class Baby{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void cry() {
		System.out.println(name+" 가 야옹야옹");
	}
}



public class BabyRefMain {

	public static void main(String[] args) {
		Baby b = new Baby();
		b.setName("고나비");
		b.cry();
		
		Baby s = b;
		s.setName("고순이");
		s.cry();
		
		b.cry();
		

	}

}


/*
고나비 가 야옹야옹
고순이 가 야옹야옹
고순이 가 야옹야옹
*/
