/**
부분 배열 복사를 위한 System.arraycopy()
**/

public class ArrayCopyMain{
	
	public static void main(String[] args){
		int[] source = new int[]{5,4,6,9,7,9};
		int[] target = {100,200,300,400,500,600,700};
		
		//부분 배열 복사의 예
		System.arraycopy(source,2 ,target,3 ,4);
		
		for(int i=0; i<target.length; i++){
			System.out.println("target["+i+"]:"+target[i]);
		}
	}
	
}


/*
Gonabiui-MacBook-Pro:chap06 gonabi$ java ArrayCopyMain
target[0]:100
target[1]:200
target[2]:300
target[3]:6
target[4]:9
target[5]:7
target[6]:9

target 배열의 크기만큼만 들어가진다.
*/