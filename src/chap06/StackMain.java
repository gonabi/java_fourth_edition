/**
Stack 클래스의 사용
**/

import java.util.*;

public class StackMain{
	
	public static void main(String[] args){
		
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());//스택에 아무것도 없으면 true
		stack.push(new String("a"));
		stack.push(new String("b"));
		stack.push(new String("c"));
		
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.search("a")); //뒤에서 위치값 구해서 인덱스 리턴
		System.out.println(stack);
		
	}
}

/*
	
Gonabiui-MacBook-Pro:chap06 gonabi$ javac StackMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java StackMain
true
false
c
c
b
2
[a, b]

*/