/**
Vector 클래스의 기본적인 사용
**/

import java.util.Vector;

public class VectorMain{
	
	public static void main(String[] args){
		
		Vector<String> v = new Vector<String>();//Vector 객체 생성
		System.out.println("Vector생성 직후의 size: "+v.size());
		
		//1. 벡터에 데이터 4개 삽입
		v.addElement(new String("Gonabi0"));
		v.addElement(new String("Gonabi1"));
		v.addElement(new String("Gonabi2"));
		v.addElement(new String("Gonabi3"));
		System.out.println("Vector에 데이터 삽입 후의 size: "+v.size());
		
		
		//2. 벡터의 요소 출력
		for(int i=0; i<v.size(); i++){
			//인덱스를 이용한 데이터 추출(다운캐스팅은 필수적)
			String temp = v.elementAt(i);
			System.out.println("Vector v의 "+i+"번째:"+temp);
		}
		
		
		
	}
}

/*
Gonabiui-MacBook-Pro:chap06 gonabi$ javac VectorMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java VectorMain
Vector생성 직후의 size: 0
Vector에 데이터 삽입 후의 size: 4
Vector v의 0번째:Gonabi0
Vector v의 1번째:Gonabi1
Vector v의 2번째:Gonabi2
Vector v의 3번째:Gonabi3
*/