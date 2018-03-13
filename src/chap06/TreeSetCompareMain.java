/*
TreeSet의 Comparator구현
*/
//package chap06;

import java.util.*;

class Score{
	private int korea=0;
	private int math=0;
	
	public Score(int korea, int math) {
		this.korea = korea;
		this.math = math;
	}//생성
	
	public int getSum() {
		return this.korea + this.math;
	}
	
	public String toString() {
		return "국어:"+korea+"수학:"+math;
	}
	
}

class MyComparator<T> implements Comparator<T>{
	public int compare(T o1 , T o2) {
		Score s1 = (Score) o1;
		Score s2 = (Score) o2;
		int r = s1.getSum() - s2.getSum();
		if(r>0) {
			return 1;//오름차순 정렬
		}else if(r==0) {
			return 0;
		}else {
			return -1; //내림차순 정렬 
		}
	}
}





public class TreeSetCompareMain {

	public static void main(String[] args) {
		TreeSet<Score> test = new TreeSet<Score>(new MyComparator<Score>());
		test.add(new Score(21,22));
		test.add(new Score(61,62));
		test.add(new Score(81,82));
		test.add(new Score(11,12));
		test.add(new Score(31,32));
		System.out.println("TreeSet Sorting Example:"+test);
	}

}


/*
Comparator의 구현 방법은 거의 일반화되어 있다. 
이것은 1,0,-1을 리턴하는 것에 따라 정렬 방법이 달라지기때문이다. 
위의 Comparator의 구현 방법을 알고 있으면 다른 곳에 응용할 수도 있을 것이다.


Gonabiui-MacBook-Pro:chap06 gonabi$ javac TreeSetCompareMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java TreeSetCompareMain
TreeSet Sorting Example:[국어:11수학:12, 국어:21수학:22, 국어:31수학:32, 국어:61수학:62, 국어:81수학:82]
*/

