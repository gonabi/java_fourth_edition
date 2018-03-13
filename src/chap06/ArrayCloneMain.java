package chap06;

public class ArrayCloneMain {

	public static void main(String[] args) {
		int[] source = new int[] {5,4,6,9,7,9};
		int[] target = (int[]) source.clone(); //clone()을 이용한 메모리 복사
		for( int i=0; i<target.length; i++ ) {
			System.out.println("target["+i+"]"+ target[i]);
			
		}
	}

}

/*
target[0]5
target[1]4
target[2]6
target[3]9
target[4]7
target[5]9

*/