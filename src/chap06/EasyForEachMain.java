/**
Advanced for(for each) 구문의 사용
**/

import java.util.*;

public class EasyForEachMain{
	public static void main(String[] args){
		String[] ar = new String[]{"나비1","나비2","나비3"};
		for(String tmp : ar){
			System.out.println(tmp);
		}
	}
}

/*

Gonabiui-MacBook-Pro:chap06 gonabi$ javac EasyForEachMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java EasyForEachMain
나비1
나비2
나비3
*/