/*
객체 배열을 테스트하는 예
*/
package chap06;

class Dog{
	private String name;
	private String kind;
	
	public Dog(String name, String kind){
		this.name = name;
		this.kind = kind;
	}//생성자
	
	
	public String toString(){
		return kind+":"+name;
	}
	
}




public class ObjectArrayMain {

	public static void main(String[] args) {
		//1. 객체 배열의 생성
		Dog[] dog = new Dog[5];
		for( int i=0; i<dog.length; i++ ){
			System.out.println("Dog["+i+"] :"+dog[i]);
		}
				
		
		//2. 객체배열의 참조변수에 메모리할당
		dog[0] = new Dog("쫑쫑","불");
		dog[1] = new Dog("워리","똥개");
		dog[2] = new Dog("개똥이","진도개");
		dog[3] = new Dog("발리","푸들");
		dog[4] = new Dog("투덜이","잡종");
		
		for(int i=0; i<dog.length; i++ ){
			System.out.println("Dog["+ i + "] : " +dog[i].toString());
		}
		
	}

}


/*
Dog[0] :null
Dog[1] :null
Dog[2] :null
Dog[3] :null
Dog[4] :null
Dog[0] : 불:쫑쫑
Dog[1] : 똥개:워리
Dog[2] : 진도개:개똥이
Dog[3] : 푸들:발리
Dog[4] : 잡종:투덜이
*/
