/**
org\jabook\LibraryHelloWorld 라이브러리 테스트
**/
import org.jabook.LibraryHelloWorld;


public class LibraryHelloWorldMain{
	public static void main(String[] args){
		LibraryHelloWorld lhw1 = new LibraryHelloWorld();
		String str1 = lhw1.sayHello("홍길동1");
		System.out.println(str1);
		
		org.jabook.LibraryHelloWorld lhw2 = new org.jabook.LibraryHelloWorld();
		String str2 = lhw2.sayHello("홍길동2");
		System.out.println(str2);
	}
}