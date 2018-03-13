/*
 TreeMap에서 Comparator구현 
 */

package chap06;

import java.util.*;

class Score{
	private int korea=0;
	private int math=0;
	
	public Score(int korea, int math) {
		this.korea = korea;
		this.math = math;
	}
	
	public int getSum() {
		return this.korea + this.math;
	}
	
	public String toString() {
		return "국어:"+korea+"수학:"+math;
	}
	
}

class MyComparator<T> implements Comparator<T>{
	public int compare(T o1, T o2) {
		Score s1 = (Score)o1;
		Score s2 = (Score)o2;
		int r = s1.getSum() - s2.getSum();
		
		if(r>0) { 
			return 1;//오름차순 정렬
		}else if(r==0) {
			return 0;
		}else {
			return -1;//내림차순 정렬
		}
		
	}
}


public class TreeMapCompareMain {

	public static void main(String[] args) {
		TreeMap<Score,String> test = new TreeMap<Score,String>(new MyComparator<Score>());
		test.put(new Score(21,22),"고나비1");
		test.put(new Score(61,62),"고나비2");
		test.put(new Score(81,82),"고나비3");
		test.put(new Score(11,12),"고나비4");
		test.put(new Score(31,32),"고나비5");
		System.out.println("TreeMap Sorting Example:"+test);

	}

}
/*
TreeMap Sorting Example:{국어:11수학:12=고나비4, 국어:21수학:22=고나비1, 국어:31수학:32=고나비5, 국어:61수학:62=고나비2, 국어:81수학:82=고나비3}
*/