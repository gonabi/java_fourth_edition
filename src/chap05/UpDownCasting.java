package chap05;
/**
업캐스팅과 다운 캐스팅의 데스트	
**/

import java.util.Vector;

public class UpDownCasting{
	
	
	public static void main(String[] args){
		
		String name = new String("홍길동");
		Integer id = new Integer(1000);
		
		Vector v = new Vector();
		
		v.addElement(name);//자동 업캐스팅
		v.addElement(id);//자동 업캐스팅
		
		
		Object obj1 = v.elementAt(0);//강제 다운캐스팅
		Object obj2 = v.elementAt(1);//강제 다운캐스팅
		
		
		String str = (String)obj1;
		Integer num = (Integer)obj2;
		System.out.println("이름:"+str+" 번호:"+num);
		
		
		String str2 = (String)v.elementAt(0); //강제 다운캐스팅
		Integer num2 = (Integer)v.elementAt(1); //강제 다운캐스팅
		System.out.println("이름:"+str2+" 번호:"+num2);
				
			
	}
	
}
/*
이름:홍길동 번호:1000
이름:홍길동 번호:1000
*/


