/*
배열의 복사를 직접 구현하는 예	
*/

class ArrayParam{	
	//배열 복사를 위한 메모리를 메서드 내에서 생성
	public int[] copyArray(int[] src){
		int[] des = new int[src.length];//새로운 배열 생성
		for(int i=0; i<src.length; i++ ){
			des[i] = src[i]; //값 복사
		}
		return des;
	}
	
	//배열 복사를 위한 메모리를 매개변수로 받음, 오버로딩
	public void copyArray(int[] src, int[] des){
		for(int i=0; i<src.length; i++){
			des[i] = src[i];//값복사
		}
	}
	
}


public class ArrayParamMain{
	
	public static void main(String[] args){
		int[] source = new int[]{1,2,3,4,5};//배열 생성
		ArrayParam p = new ArrayParam();// 객체 생성
		
		//1. copyArray(int[] src)호출
		int[] result = p.copyArray(source);
		for(int i=0; i<result.length; i++){
			System.out.println("result["+i+"] :" + result[i]);
		}
		System.out.println();
		
		
		//2. copyArray(source, target);
		int[] target = new int[source.length];
		p.copyArray(source, target);
		for(int i=0; i<target.length; i++){
			System.out.println("target["+i+"] :" +target[i]);
		}
		
		
	}
}


/*
Gonabiui-MacBook-Pro:chap06 gonabi$ javac ArrayParamMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java ArrayParamMain
result[0] :1
result[1] :2
result[2] :3
result[3] :4
result[4] :5

target[0] :1
target[1] :2
target[2] :3
target[3] :4
target[4] :5
*/


