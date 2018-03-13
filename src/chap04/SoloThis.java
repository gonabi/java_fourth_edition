/*
this를 return 으로 사용하는 경우를 테스트하는 예	
*/

public class SoloThis{
	
	private int i = 0;
	
	public SoloThis getMySelf(){
		return this;
	}
	
	public void print(){
		this.i++;
		System.out.println("member i= "+this.i);
	}
	
	public static void main(String[] args){
		SoloThis st1 = new SoloThis(); //객체 생성
		System.out.println("SoloThis st1 :  "+st1);
		st1.print();
		st1.print();
		
		SoloThis st2 = st1.getMySelf();//this
		System.out.println("SoloThis st2 :  "+st2);
		st2.print();
		st2.print();
		
	}
}


/*
Gonabiui-MacBook-Pro:chap04 gonabi$ javac SoloThis.java 
Gonabiui-MacBook-Pro:chap04 gonabi$ java SoloThis
SoloThis st1 :  SoloThis@74a14482
member i= 1
member i= 2
SoloThis st2 :  SoloThis@74a14482
member i= 3
member i= 4	
	
*/