/**
Sun 클래스를 이용한 참조값 비교
**/

public class SunMain{
    public static void main(String[] args){
		Sun s1 = null; //객체 변수 선언
		Sun s2 = null; //객체 변수 선언
		s1 = new Sun(); //메모리 할당
		s2 = new Sun(); //메모리 할당
		System.out.println("Sun의 변수 s1==s2:"+(s1==s2));// 객체 변수 비교
    }
}
//Sun의 변수 s1==s2:false